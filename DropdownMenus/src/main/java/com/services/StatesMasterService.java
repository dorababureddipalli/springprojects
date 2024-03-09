package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.StatesMaster;
import com.repo.StateMasterRepo;

@Service
public class StatesMasterService {

	@Autowired
	private StateMasterRepo smR;

	public StatesMaster save(StatesMaster sm) {
		return smR.saveState(sm);
	}

	public List<StatesMaster> viewStates() {
		//smR.dataForStatesMaster();
		return smR.getAllStates();
	}
	
	
}
