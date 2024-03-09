package com.controllerss;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.SsaRequest;
import com.services.SsaEnrollmentService;

@RestController
public class SsaEnrollmentController {

	private SsaEnrollmentService ssaEnrollSer;

	public SsaEnrollmentController(SsaEnrollmentService ssaEnrollSer) {
		this.ssaEnrollSer = ssaEnrollSer;
	}

	@PostMapping(value = "/enroll", consumes = "application/json")
	public ResponseEntity<String> ssaEnrollmentHandler(@RequestBody SsaRequest ssaReq) {
		String re = null;
		Long ssaGenerator = ssaEnrollSer.ssaGenerator(ssaReq);
		if (ssaGenerator != null)
			re = "your SSA generated successfully :: " + Long.toString(ssaGenerator);
		else
			re = "SSA generation failed";
		return new ResponseEntity<String>(re, HttpStatus.CREATED);
	}
}
