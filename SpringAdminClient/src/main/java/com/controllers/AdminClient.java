package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminClient {
	@GetMapping(value = "/wish")
	public String wishMsg() {
		return "Hello";
	}
}
