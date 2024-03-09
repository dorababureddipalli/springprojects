package com.services;

import org.springframework.stereotype.Service;

import com.model.SsaRequest;

@Service
public interface SsaEnrollmentService {
	
	public Long ssaGenerator(SsaRequest sr);
	
//	public List<String> getSsaStates();
//	
	public boolean ssaValidator(Long ssaNo);
}
