package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2RestController {

	@GetMapping(value = "/hi/{name}")
	public String hiMessage(@PathVariable("name") String name) {
		return "babu";
	}

}
