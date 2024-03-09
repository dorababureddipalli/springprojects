package com.acoder.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.acoder.pojo.EmployeeEntity;

@Repository
@CacheConfig
public class EmployeeServiceRepoImp implements EmployeeServiceRepo {

	@Autowired
	private EmpJpaRepo repo;

	@Override
	@CachePut(cacheNames = "Employee", key = "#entity.empNo")
	public EmployeeEntity save(EmployeeEntity entity) {
		// TODO Auto-generated method stub
		repo.save(entity);
		return entity;
	}

	@Override
	@Cacheable(cacheNames = "Employee", key = "#Id")
	public EmployeeEntity findById(String Id) {
		// TODO Auto-generated method stub
		System.out.println("Data from db");
		return repo.findById(Id).get();
	}

	@Override
	@CachePut(cacheNames = "Employee", key = "#entity.empNo")
	public void update(EmployeeEntity entity) {
		// TODO Auto-generated method stub
		repo.save(entity);

	}

	@Override
	@CacheEvict(cacheNames = "Employee", key = "#id")
	public void delete(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	@Cacheable(cacheNames = "Employee")
	public List<EmployeeEntity> findAll() {
		// TODO Auto-generated method stub
		System.out.print("from db");
		return repo.findAll();
	}

}
