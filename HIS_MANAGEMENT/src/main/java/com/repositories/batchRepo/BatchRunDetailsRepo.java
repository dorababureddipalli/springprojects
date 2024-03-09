package com.repositories.batchRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batchentities.BatchRunDetails;

public interface BatchRunDetailsRepo extends JpaRepository<BatchRunDetails, Integer> {

}
