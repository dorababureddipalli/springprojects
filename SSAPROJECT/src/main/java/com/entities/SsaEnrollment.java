package com.entities;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "SSA_MASTER")
@Data
public class SsaEnrollment {
	@Id
	//@GeneratedValue
	@Column(name = "SSA_NO")
	private Long ssaNo;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "STATE")
	private String state;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	// @Temporal(TemporalType.DATE)
	private Date createdDate;

	@CreationTimestamp
	@Column(name = "UPDATED_DATE", insertable = false)
	private Date updatedDate;
}
