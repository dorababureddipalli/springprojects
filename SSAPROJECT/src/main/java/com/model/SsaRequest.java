package com.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SsaRequest {

	private String firstName;

	private String lastName;

	private String state;

	@DateTimeFormat(pattern = "yyyy/mm/dd")
	private Date dob;

	private String gender;

}
