package com.batchentities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BatchRunDetails {
	@Id
	private Integer batchRunSeq;
	private String batchName;
	private String runStatus;
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer instanseNum;
}
