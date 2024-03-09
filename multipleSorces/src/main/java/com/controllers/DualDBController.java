package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.entites.Employee;
import com.employees.repositories.EmployeeRepository;
import com.students.entities.Student;
import com.students.repositories.StudentRepository;

@RestController
public class DualDBController {

	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private StudentRepository studentRepo;

	@GetMapping(value = "/student", produces = "application/json")
	public ResponseEntity<List<Student>> student() {
		Student s1 = new Student(2023001, "dorababu", 8.5);
		Student s2 = new Student(2023002, "veerababu", 9.5);
		List<Student> slist = new ArrayList<>();
		slist.add(s2);
		slist.add(s1);
		try {
			studentRepo.saveAll(slist);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<List<Student>>(slist, HttpStatus.CREATED);

	}
	@GetMapping(value = "/employee", produces = "application/json")
	public ResponseEntity<List<Employee>> employee() {
		Employee s1 = new Employee("2023EMP001", "dorababu", "Developer");
		Employee s2 = new Employee("2023EMP002", "veerababu", "Tester");
		List<Employee> empList = new ArrayList<>();
		empList.add(s2);
		empList.add(s1);
		try {
			empRepo.saveAll(empList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<List<Employee>>(empList, HttpStatus.CREATED);

	}
}
