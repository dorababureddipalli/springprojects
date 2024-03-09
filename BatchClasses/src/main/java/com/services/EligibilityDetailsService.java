package com.services;

import org.springframework.stereotype.Service;

import com.entities.EligibilityDetails;

@Service
public interface EligibilityDetailsService {

	EligibilityDetails save(EligibilityDetails eligibilityDetails);
	
	EligibilityDetails findByCaseNumber(Integer caseNumber);

}
