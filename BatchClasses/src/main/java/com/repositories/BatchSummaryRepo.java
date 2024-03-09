package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Integer>{

}
