package com.acoder.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acoder.pojo.EmployeeEntity;

public interface EmpJpaRepo extends JpaRepository<EmployeeEntity, Serializable> {

}
