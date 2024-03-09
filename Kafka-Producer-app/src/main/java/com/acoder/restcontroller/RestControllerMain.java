package com.acoder.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acoder.pojo.Customer;
import com.acoder.service.ProducerService;

@RestController
public class RestControllerMain {

	@Autowired
	private ProducerService service;
	@PostMapping("/add")
	public String  add(@RequestBody List<Customer> customer)
	{
		service.sendMassage(customer);
		return "successful add to topic";
		
	}
}
