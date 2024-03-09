package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "HIS_CASEWORKER")
public class HIS_CaseWorker {
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String password;

	@Column(unique = true)
	private String eMail;

	@Column
	private String gender;

	@Column
	private String role;

	@Column
	private String accStatus = "Locked";

	@Column
	private String sftDlt;


}
