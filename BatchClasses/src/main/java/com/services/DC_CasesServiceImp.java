package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.DC_Cases;
import com.repositories.DC_CasesRepository;

@Service
public class DC_CasesServiceImp implements DC_CasesService {

	@Autowired
	private DC_CasesRepository dcCaseRepo;

	@Override
	public DC_Cases save(DC_Cases dc_Cases) {
		return dcCaseRepo.save(dc_Cases);
	}

}
