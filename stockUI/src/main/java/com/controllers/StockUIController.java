package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.reactive.function.client.WebClient;

import com.pojos.Stock;

@Controller
public class StockUIController {

//	@Autowired
//	private StockAmountClient stockAmountClient;

	@GetMapping(value = "/stockUI")
	public String loadUI(Model m) {
	Stock s = new Stock();
	m.addAttribute("stock", s);
		return "form";
	}

	@GetMapping(value = "/stockresponse")
	public String stockResponse(@ModelAttribute("stock") Stock stock, Model m) {
		WebClient webClient = WebClient.create();
		String amount = webClient.get().uri("http://localhost:5555/calc/stockamount/{companyName}/{Quantity}",
				stock.getStockCompanyName(), stock.getStockQuantity()).retrieve().bodyToMono(String.class).block();
		m.addAttribute("amount", amount);
		m.addAttribute("stock", stock);
		return "stockResponse";
	}

}
