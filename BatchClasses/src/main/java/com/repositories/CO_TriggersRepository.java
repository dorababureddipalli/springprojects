package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.CO_Triggers;

public interface CO_TriggersRepository extends JpaRepository<CO_Triggers, Integer> {
	
//	@Query(value="select * from CO_Triggers where TriggerStatus='p'")
	List<CO_Triggers> findByTriggerStatus(String triggerStatus);
	
}
