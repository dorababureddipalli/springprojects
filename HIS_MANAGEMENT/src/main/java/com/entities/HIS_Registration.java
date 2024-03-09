package com.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class HIS_Registration {
	@Id
	private String registrationNo;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String gender;
	private Long ssn;
	private Long phoneNo;
	private String email;
}
