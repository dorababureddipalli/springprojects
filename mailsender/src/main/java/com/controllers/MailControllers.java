package com.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entities.MailEntity;
import com.services.MailService;

@Controller
public class MailControllers {
	@Autowired
	private MailService mailservice;
	private Logger logger=LoggerFactory.getLogger(getClass());
	@GetMapping("/loadForm")
	public String loadMailForm(Model model) {
		logger.info("form loading started...");
		model.addAttribute("mailAttributes", new MailEntity());
		logger.info("form loading completed");
		return "emailForm";
	}

	@PostMapping(value = "/send-mail") /* ,consumes="application/json",produces="application/json" */
	public @ResponseBody String mailSender(@ModelAttribute("mailAttributes") MailEntity mailAttributes) {
		try {
			mailservice.emailService(mailAttributes.getSendTo(), mailAttributes.getMailSubject(), "html-mail.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "mail sent successfully..";
	}
	@GetMapping("/example")
	public String sampleMail() {
		return "mailJsp";
	}

}