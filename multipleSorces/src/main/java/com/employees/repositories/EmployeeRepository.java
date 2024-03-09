package com.employees.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employees.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

}
