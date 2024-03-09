package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clients.StockPriceClient;

@RestController
@RequestMapping("calc")
public class StockAmountClient {
	@Autowired
	private Environment env;
	@Autowired
	private StockPriceClient stockPriceClient;

	@GetMapping(value = "/stockamount/{companyName}/{Quantity}")
	public ResponseEntity<Double> getStockAmount(@PathVariable("companyName") String companyName,
			@PathVariable("Quantity") Integer Quantity) {
		String property = env.getProperty("local.server.port");
		System.out.println(property);
		Double stockPrice = stockPriceClient.getStockPrice(companyName);
		if (stockPrice != null)
			stockPrice = (stockPrice * Quantity);
		return new ResponseEntity<Double>(stockPrice, HttpStatus.ACCEPTED);
	}

}
