package com.services;

import org.springframework.stereotype.Service;

import com.entities.DC_Cases;

@Service
public interface DC_CasesService {

	DC_Cases save(DC_Cases dc_Cases);

}
