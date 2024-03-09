package com.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.BatchSummary;
import com.repositories.BatchSummaryRepo;

@Service
public class BatchSummaryService {

	@Autowired
	private BatchSummaryRepo bsr;

	public BatchSummary create(BatchSummary ds) {
		return bsr.save(ds);
	}

	public Optional<BatchSummary> create(Integer summaryId) {
		return bsr.findById(summaryId);
	}

	public void update(BatchSummary ds) {
		bsr.save(ds);
	}

	public void delete(Integer summaryId) {
		bsr.deleteById(summaryId);
	}

}
