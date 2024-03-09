package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.StockServiceImp;

@RestController
@RequestMapping(value="/price")
public class StockPriceRestController {
	@Autowired
	private StockServiceImp stockServiceImp;

	@GetMapping(value = "/stockprice/{companyName}")
	public ResponseEntity<Double> StockPrice(@PathVariable("companyName") String companyName) {
		Double stockPrice = stockServiceImp.getStockPrice(companyName);
		return new ResponseEntity<Double>(stockPrice, HttpStatus.OK);
	}

}
