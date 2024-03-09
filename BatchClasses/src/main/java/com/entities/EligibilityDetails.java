package com.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EligibilityDetails {
	@Id
	private Integer edTraceId;
	private Double benifitAmount;
	private Integer caseNumber;
	private LocalDate createDate;
	private LocalDate updateDate;
	private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planStatus;
	private String planDenialReason;

}
