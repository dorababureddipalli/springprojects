package com.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
@SequenceGenerator(name = "CUST_SEQ_GEN", sequenceName = "CUST_SEQ", allocationSize = 1)
public class BatchRunDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator ="CUST_SEQ_GEN")
	private Integer batchRunSeq;
	private String batchName;
	private String batchRunStatus;
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer instanceNO;

}
