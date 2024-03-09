package com.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.States;

public interface SsaStatesRepository extends JpaRepository<States, Serializable> {
//	@Query(value = "select STATE_NAME from STATES_MASTER")
//	public List<String> getStateNames();

}
