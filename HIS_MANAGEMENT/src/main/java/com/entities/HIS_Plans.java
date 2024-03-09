package com.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "HIS_PLAN_DETAILS")
public class HIS_Plans {

	@Id
	@GeneratedValue
	private Integer planId;

	private String planName;

	private String planDesc;

	private LocalDate startDate;

	private LocalDate endDate;

	@CreationTimestamp
	@Column(name = "created_at", updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(name = "updated_at")
	private LocalDate modifiedDate;

}
