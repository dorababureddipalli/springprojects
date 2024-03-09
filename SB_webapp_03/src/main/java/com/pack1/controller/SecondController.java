package com.pack1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class SecondController {

	@GetMapping("/wish")
	public String displayMail(Model model) {
		model.addAttribute("mail", "dorababureddipalli2000@gmail.com");
		return "Index2";
	}

}
