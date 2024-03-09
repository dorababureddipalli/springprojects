package com.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DC_Cases {

	@Id
	@GeneratedValue
	private Integer caseNumber;
	private String appID;
	private LocalDate createDate;
	private LocalDate updateDate;
	private String email;
	private String fName;
	private String lName;
	private String gender;
	private String phoneNO;
	private Long ssn;

	public DC_Cases() {
		this.caseNumber = 123; // Sample case number
		this.appID = "ABC123"; // Sample appID
		this.createDate = LocalDate.now(); // Current date as sample createDate
		this.updateDate = LocalDate.now(); // Current date as sample updateDate
		this.email = "sample@email.com";
		this.fName = "John";
		this.lName = "Doe";
		this.gender = "Male";
		this.phoneNO = "123-456-7890";
		this.ssn = 123456789L;
	}
}
