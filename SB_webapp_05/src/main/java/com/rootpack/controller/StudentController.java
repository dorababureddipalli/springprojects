package com.rootpack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	@GetMapping("/studentDetails")
	public String studentDetails(@RequestParam("name") String name, @RequestParam("marks") String marks, Model model) {
		String sDetails = "Student " + name + " got " + marks + " marks out of 1000";
		model.addAttribute("marks", sDetails);
		return "student";
	}

	@GetMapping("/empDetails/{eid}/{ename}/{eprof}")
	public String details(@PathVariable("eid") String empId, @PathVariable("ename") String empName,
			@PathVariable("eprof") String profession, Model model) {
		String eDetails = "Employee ID is " + empId + " and Employee Name is " + empName + " working as a " + profession;
		model.addAttribute("emp", eDetails);
		return "employee";
	}

}
