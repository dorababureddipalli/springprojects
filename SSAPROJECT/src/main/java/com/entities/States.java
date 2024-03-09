package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "STATES_MASTER")
@Data
public class States {
	@Id
	@GeneratedValue
	@Column(name = "STATES_ID")
	private Integer stateId;

	@Column(name = "STATE_NAME")
	private String stateName;
}
