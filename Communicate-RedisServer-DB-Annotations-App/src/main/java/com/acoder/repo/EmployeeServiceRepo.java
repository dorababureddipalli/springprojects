package com.acoder.repo;

import java.util.List;

import com.acoder.pojo.EmployeeEntity;

public interface EmployeeServiceRepo {
	
	EmployeeEntity save(EmployeeEntity entity);

	
	EmployeeEntity findById(String Id);

	void update(EmployeeEntity entity);

	void delete(String id);

	List<EmployeeEntity> findAll();
}
