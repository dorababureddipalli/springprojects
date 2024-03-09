package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialRestController {
	@GetMapping("/")
	public String wishMsg() {
		return "Hello ,not secured..!";
	}

	@GetMapping("/login")
	public String wishMsg2() {
		return "Hello, secured..!";
	}
}
