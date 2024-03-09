package com.rootpack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rootpack.bindings.Products;

@Controller
public class ProductController {

	@GetMapping("/pform")
	public String productEntry(Model model) {
		Products product = new Products();
		model.addAttribute("prdctObj", product);
		return "pinput";
	}

	@PostMapping("/presult")
	public String submitHolder(Products product, Model model) {
		model.addAttribute("prdctObj", product);
		return "poutput";
	}

}
