package com.controllerss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.services.SsaEnrollmentService;

@RestController
public class SsaValidatorController {
	@Autowired
	private SsaEnrollmentService ssaEnrollSer;

	@GetMapping(value = "/validate/{ssaNo}")
	public String ssaValidator(@PathVariable("ssaNo") Long ssaNo) {
		boolean ssaValidator = ssaEnrollSer.ssaValidator(ssaNo);
		if (ssaValidator == true)
			return "VALID";
		else
			return "IN-VALID";
	}
}
