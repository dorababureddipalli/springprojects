package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	@GetMapping("/get")
	public String wishController() {
		return "hai ,welcome to spring docker project";
	}

}
