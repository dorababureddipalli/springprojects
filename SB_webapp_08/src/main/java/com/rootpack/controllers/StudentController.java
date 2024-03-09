package com.rootpack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rootpack.bindings.Students;
import com.rootpack.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService stuser;

	@GetMapping("/rform")
	public String registerForm(Model model) {
		model.addAttribute("students", new Students());
		model.addAttribute("gender", stuser.getGender());
		model.addAttribute("course", stuser.getCourse());
		model.addAttribute("timings", stuser.getTimings());
		return "Register";
	}

	@PostMapping("/student")
	public String submitHandler(Students s, Model model) {
		model.addAttribute("students", s);
		return "success";
	}

}
