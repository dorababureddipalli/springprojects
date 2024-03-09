package com.services;

import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.SsaEnrollment;
import com.model.SsaRequest;
import com.repositories.SsaEnrollmentRepository;

@Service
public class SsaEnrollmentServiceImp implements SsaEnrollmentService {

	@Autowired
	private SsaEnrollmentRepository ser;

//	@Autowired
//	private SsaStatesRepository ssr;S

	@Override
	public Long ssaGenerator(SsaRequest sr) {
		SsaEnrollment se = new SsaEnrollment();
		BeanUtils.copyProperties(sr, se);
		SsaEnrollment savedSsa = null;
		try {
			se.setSsaNo(generate12DigitRandomNumber());
			savedSsa = ser.save(se);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return savedSsa.getSsaNo();
	}

//	@Override
//	public List<String> getSsaStates() {
//
//		return ssr.getStateNames();
//	}
//
	@Override
	public boolean ssaValidator(Long ssaNo) {
		boolean flag = false;
		SsaEnrollment byssaNo = ser.findByssaNo(ssaNo);
		if (byssaNo != null) {
			if (byssaNo.getState().equalsIgnoreCase("new jersey")) {
				return flag = true;
			}
		} else
			return flag;
		return flag;
	}

	public long generate12DigitRandomNumber() {
		Random random = new Random();

		// Generate a random long value between 1,000,000,000,000 and 9,999,999,999,999
		long randomValue = (long) (random.nextDouble() * 9_000_000_000_000L) + 1_000_000_000_000L;

		// Ensure the generated number is 12 digits by taking the last 12 digits
		randomValue %= 1_000_000_000_000L;

		return randomValue;
	}

}
