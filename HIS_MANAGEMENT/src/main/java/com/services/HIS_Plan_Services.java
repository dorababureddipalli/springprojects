package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.entities.HIS_Plans;
import com.repositories.HIS_Plan_Repository;

@Service
public class HIS_Plan_Services {
	@Autowired
	private HIS_Plan_Repository hpr;

	public HIS_Plans createPlan(HIS_Plans hp) {
		return hpr.save(hp);
	}

	public Page<HIS_Plans> viewPlans(Pageable p) {
		return hpr.findAll(p);
	}

	public void updatePlan(HIS_Plans hps) {
		// HIS_Plans findByPlanName = hpr.findByPlanName(planName);
		if (hps != null) {
			hpr.save(hps);
		}
	}

	public void deletePlan(String planName) {
		HIS_Plans findByPlanName = hpr.findByPlanName(planName);
		if (findByPlanName != null)
			hpr.delete(findByPlanName);
	}

}
