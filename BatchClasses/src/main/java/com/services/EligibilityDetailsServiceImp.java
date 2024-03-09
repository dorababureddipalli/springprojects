package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.EligibilityDetails;
import com.repositories.EligibilityDetailsRepository;

@Service
public class EligibilityDetailsServiceImp implements EligibilityDetailsService {

	@Autowired
	private EligibilityDetailsRepository eligDetRepo;

	@Override
	public EligibilityDetails save(EligibilityDetails eligibilityDetails) {
		return eligDetRepo.save(eligibilityDetails);
	}

	@Override
	public EligibilityDetails findByCaseNumber(Integer caseNumber) {

		return eligDetRepo.findByCaseNumber(caseNumber);
	}

}
