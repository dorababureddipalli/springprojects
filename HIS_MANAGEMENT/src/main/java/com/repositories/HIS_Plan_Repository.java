package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.HIS_Plans;

public interface HIS_Plan_Repository extends JpaRepository<HIS_Plans, Integer>{
	public HIS_Plans findByPlanName(String planName);
}
