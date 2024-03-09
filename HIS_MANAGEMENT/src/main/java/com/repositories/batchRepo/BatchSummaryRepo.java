package com.repositories.batchRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batchentities.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Integer>{

}
