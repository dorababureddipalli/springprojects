package com.controllers;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.entities.HIS_Registration;
import com.repositories.HIS_RegistrationRepo;
import com.services.HIS_RegistrationService;

@Controller
public class HIS_RegistrationController {

	@Autowired
	private HIS_RegistrationRepo regRepo;
	@Autowired
	private HIS_RegistrationService hisRegServ;

	@GetMapping(value = "/registerform")
	public String hisRegistration(Model m) {
		m.addAttribute("hisRegistration", new HIS_Registration());
		return "register";
	}

	@PostMapping(value = "/registerHandler")
	public String registrationHandler(@ModelAttribute("hisRegistration") HIS_Registration hisRegistration, Model m) {
		hisRegistration.setRegistrationNo(hisRegServ.generateRegistrationNumber());
		System.out.println(hisRegistration);
		HIS_Registration save = null;
		try {
			Long ssn = hisRegistration.getSsn();
			System.out.println(hisRegistration.getRegistrationNo());
			HttpResponse<String> httpResponse = hisRegServ.sendGetRequest("http://localhost:9095/validate/"+ssn);
			String body = httpResponse.body();
			System.out.println(body);
			if (body.equalsIgnoreCase("valid")) {
				save = regRepo.save(hisRegistration);
				
				m.addAttribute("msg", "Registration successfull the Registration no : " + save.getRegistrationNo());
			}
			else
				m.addAttribute("msg", "Registration Un-successfull");
		} catch (Exception e) {
			e.printStackTrace();
			
		}

		return "register";
	}

}
