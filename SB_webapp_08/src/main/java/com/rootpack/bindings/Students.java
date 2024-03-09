package com.rootpack.bindings;

import java.util.Arrays;

public class Students {
	private String fName;
	private String lName;
	private String email;
	private String gender;
	private String course;
	private String[] timings;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String fName, String lName, String email, String gender, String course, String[] timings) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
		this.course = course;
		this.timings = timings;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String[] getTimings() {
		return timings;
	}

	public void setTimings(String[] timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "Students [fName=" + fName + ", lName=" + lName + ", email=" + email + ", gender=" + gender + ", course="
				+ course + ", timings=" + Arrays.toString(timings) + "]";
	}
}
