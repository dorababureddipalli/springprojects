package com.rootpack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rootpack.bindings.Employee;

@Controller
public class EmployeeController {
	@GetMapping("/input")
	public String  loadForm() {
		return "userform";
	}
	
	@PostMapping("/response")
	public String submitHandler(Employee emp,Model model) {
		model.addAttribute("empObj",emp);
		return "OPforn";
	}
}
