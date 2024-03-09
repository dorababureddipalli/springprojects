package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entities.Contact;
import com.repositories.ContactRepository;
import com.services.ContactServiceImp;

@Controller
public class ContactController {
	@Autowired
	private ContactServiceImp contactRepo;

	@GetMapping(value = "/form")
	public String loadForm(Model m) {
		m.addAttribute("contact", new Contact());
		return "ContactForm";
	}

	@GetMapping(value = "/emailvalidate")
	public @ResponseBody String emailValidate(@RequestParam(name = "email") String email) {
		return contactRepo.emailValidator(email);

	}

	@PostMapping(value = "/add")
	public String addingContact(@ModelAttribute Contact c) {
		contactRepo.addContact(c);
		return "ContactForm";
	}

}
