package com.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.BatchRunDetails;
import com.repositories.BatchRunDetailsRepo;

@Service
public class BatchRundDetailsService {
	@Autowired
	private BatchRunDetailsRepo brdRepo;
	
	public BatchRunDetails create(BatchRunDetails brd) {
		return brdRepo.save(brd);
	}

	public Optional<BatchRunDetails> read(Integer batchRunSeq) {
		return brdRepo.findById(batchRunSeq);
	}

	public void update(BatchRunDetails brd) {
		brdRepo.save(brd);
	}

	public void delete(Integer batchRunSeq) {
		brdRepo.deleteById(batchRunSeq);
	}
}
