package com.batches;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.BatchRunDetails;
import com.entities.BatchSummary;
import com.entities.CO_Triggers;
import com.entities.EligibilityDetails;
import com.services.BatchRundDetailsService;
import com.services.BatchSummaryService;
import com.services.Co_TriggersService;
import com.services.EligibilityDetailsService;

@Component
public class BatchSteps {

	@Autowired
	private BatchRundDetailsService brs;

	@Autowired
	private BatchSummaryService bss;

	@Autowired
	private Co_TriggersService coTrigServ;

	@Autowired
	private EligibilityDetailsService edServ;

	private static final String BATCH_NAME = "DLY_CO_GEN";

//	public static Integer SUCC_TRGS_CNT = 0;
//
//	public static Integer FAIL_TRGS_CNT = 0;

	public static AtomicInteger SUCC_TRGS_CNT = new AtomicInteger(0);
	public static AtomicInteger FAIL_TRGS_CNT = new AtomicInteger(0);

	// public static Integer TTL_TRGS_PRS = 0;

	public synchronized Integer preProcess() {
		BatchRunDetails brr = new BatchRunDetails();
		brr.setBatchName(BATCH_NAME);
		brr.setBatchRunStatus("start");
		brr.setStartDate(LocalDate.now());
		brr.setEndDate(null);
		brr.setInstanceNO(null);
		BatchRunDetails runDetails = brs.create(brr);
		return runDetails.getBatchRunSeq();

	}

	public synchronized void start() {
		List<CO_Triggers> findByTriggerStatus = coTrigServ.findByTriggerStatus("P");
		// System.out.println(findByTriggerStatus);
		ExecutorService executorService = Executors.newFixedThreadPool(20);
		CompletionService<Object> pool = new ExecutorCompletionService<>(executorService);
//		findByTriggerStatus.forEach(pendingTrigger -> {
//			process(pendingTrigger);
//		});
		findByTriggerStatus.forEach(pendingTrigger -> {
			pool.submit(new Callable<Object>() {

				@Override
				public Object call() throws Exception {
					process(pendingTrigger);
					return null;
				}
			});

		});
	}

	public synchronized void process(CO_Triggers pendingTrigger) {
		try {
			EligibilityDetails byCaseNumber = edServ.findByCaseNumber(pendingTrigger.getCaseNum());
			byCaseNumber.getPlanStatus();
			if (byCaseNumber.getPlanStatus().equalsIgnoreCase("approved"))
				sendAppNotice();
			else
				sendDenNotice();
			succIncrement();
			coTrigServ.updatePendingTrigger(pendingTrigger);
		} catch (Exception e) {
			failIncrement();
		}
	}

	private synchronized void sendDenNotice() {
		System.out.println("sent Denied Notice");
		
	}

	private synchronized void sendAppNotice() {
		System.out.println("sent Approved Notice");
		
	}
	
	private synchronized Integer  succIncrement() {
		return SUCC_TRGS_CNT.incrementAndGet();

	}
	
	private synchronized Integer  failIncrement() {
		return FAIL_TRGS_CNT.incrementAndGet();

	}
	
	public synchronized void postProcess(Integer runSequence) {
		// update batch run details
		Optional<BatchRunDetails> getByRunSeq = brs.read(runSequence);
		BatchRunDetails batchRunDetails = null;
		if (getByRunSeq.isPresent())
			batchRunDetails = getByRunSeq.get();
		batchRunDetails.setBatchRunStatus("END");
		batchRunDetails.setEndDate(LocalDate.now());
		brs.update(batchRunDetails);
		// insert batch summaryDetails
		BatchSummary bs = new BatchSummary();
		bs.setBatchName(BATCH_NAME);
		bs.setSuccTriggerCount(SUCC_TRGS_CNT.get());
		bs.setFailTriggerCount(FAIL_TRGS_CNT.get());
		bs.setTotalTriggerProcessed((SUCC_TRGS_CNT.get() + FAIL_TRGS_CNT.get()));
		bss.create(bs);
	}

	public void main() {
//	BatchSteps bs = new BatchSteps();
		Integer preProcess = preProcess();
		start();
//		bs.process();
		postProcess(preProcess);
	}
}