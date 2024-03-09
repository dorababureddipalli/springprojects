package com.acoder.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acoder.pojo.EmployeeEntity;
import com.acoder.repo.EmployeeServiceRepo;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceRepo serviceRepo;

	@PostMapping(value = "/add", consumes = "application/json")
	public EmployeeEntity add(@RequestBody EmployeeEntity entity) {

		return serviceRepo.save(entity);
	}

	@GetMapping(value = "/get/{empno}")
	public EmployeeEntity getEmployeeData(@PathVariable("empno") String id) {
		return serviceRepo.findById(id);
	}

	@PostMapping(value = "/update", consumes = "application/json")
	public EmployeeEntity update(@RequestBody EmployeeEntity entity) {
		serviceRepo.save(entity);

		return serviceRepo.findById(entity.getEmpNo());
	}

	@GetMapping(value = "/delete/{empno}")
	public String delete(@PathVariable("empno") String id) {
		serviceRepo.delete(id);
		return "successful";
	}

	@GetMapping(value = "/all")
	public List<EmployeeEntity> all() {
		return serviceRepo.findAll();
	}
}
