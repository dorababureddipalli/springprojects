package com.rootpack.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<String> getGender() {
		List<String> gender = new ArrayList<>();
		gender.add("Male");
		gender.add("Female");
		return gender;
	}

	public List<String> getCourse() {
		List<String> course = new ArrayList<>();
		course.add("JAVA");
		course.add("PYTHON");
		course.add("REACT");
		course.add("SPRINGBOOT");
		return course;
	}

	public List<String> getTimings() {
		List<String> timings = new ArrayList<>();
		timings.add("Morning");
		timings.add("Afternoon");
		timings.add("Evening");
		return timings;
	}

}
