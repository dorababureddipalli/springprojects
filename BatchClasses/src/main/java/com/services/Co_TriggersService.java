package com.services;

import java.util.List;

import com.entities.CO_Triggers;

public interface Co_TriggersService {

	CO_Triggers save(CO_Triggers co_Triggers);
	
	List<CO_Triggers> findByTriggerStatus(String triggerStatus);
	
	void updatePendingTrigger(CO_Triggers co_Triggers);

}
