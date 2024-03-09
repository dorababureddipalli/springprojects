package com.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.CO_Triggers;
import com.repositories.CO_TriggersRepository;

@Service
public class Co_TriggersServiceImp implements Co_TriggersService {

	@Autowired
	private CO_TriggersRepository coTrigRepo;

	@Override
	public CO_Triggers save(CO_Triggers co_Triggers) {

		return coTrigRepo.save(co_Triggers);
	}

	@Override
	public List<CO_Triggers> findByTriggerStatus(String triggerStatus) {

		return coTrigRepo.findByTriggerStatus(triggerStatus);
	}

	@Override
	public void updatePendingTrigger(CO_Triggers co_Triggers) {
		co_Triggers.setTriggerStatus("C");
		co_Triggers.setUpdationDate(LocalDate.now());
		save(co_Triggers);

	}

}
