package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.EligibilityDetails;

public interface EligibilityDetailsRepository extends JpaRepository<EligibilityDetails, Integer> {

	public EligibilityDetails findByCaseNumber(Integer caseNumber);

}
