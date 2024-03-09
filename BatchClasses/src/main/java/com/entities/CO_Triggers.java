package com.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CO_Triggers {

	@Id
	private Integer triggerId;
	private Integer caseNum;
	private String triggerStatus;
	private LocalDate creationDate;
	private LocalDate updationDate;

}
