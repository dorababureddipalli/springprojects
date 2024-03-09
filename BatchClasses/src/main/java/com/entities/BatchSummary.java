package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
@SequenceGenerator(name = "CUST_SEQ_GEN2", sequenceName = "CUST_SEQ2", allocationSize = 1)
public class BatchSummary {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator ="CUST_SEQ_GEN2")
	private Integer batchSummary;
	private String batchName;
	private Integer succTriggerCount;
	private Integer failTriggerCount;
	private Integer totalTriggerProcessed;
}
