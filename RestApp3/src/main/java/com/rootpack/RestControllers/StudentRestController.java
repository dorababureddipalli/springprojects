package com.rootpack.RestControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rootpack.entity.Student;
import com.rootpack.repository.StudentRepo;

@RestController
public class StudentRestController {
	@Autowired
	private StudentRepo repo;

	@PostMapping(value = { "/", "/addstudent" },  produces = {
			"application/json", "application/xml" })
	public ResponseEntity<Student> addStudent() {
		// System.out.println(st);

		Student s = new Student();
		s.setsName("dorababu");
		s.setsEducation("degree");
		s.setsCourse("Bsc");
		s.setsEmail("dora@gmail.com");
		s.setsGender('M');
		s.setsMobileNo(9866925244l);
		s.setsPercentage(65);
		List<String> l=new ArrayList<>();
		l.add("java");l.add("spring");
		s.setsSkills(l);
		s.setsYOFPassOut("2021");

		Student student = null;
		if (s!= null)
			student = repo.save(s);

		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}

}
