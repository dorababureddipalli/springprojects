package com.pack1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/demo")
public class FirstController {

//	@RequestMapping("/welcome") // old approach
//	public ModelAndView displayWelcomeMsg() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg", "welcome to ashokit...!");
//		mav.setViewName("Index");
//		return mav;
//	}

	@GetMapping("/wish") // new approach
	public String displayWishMsg(org.springframework.ui.Model model) {
		model.addAttribute("msg", "Good Morning..!!");
		return "Index";
	}

	@GetMapping
	public String viewName(Model model) {
		model.addAttribute("msg", "Dorababu");
		return "Index";
	}
}
