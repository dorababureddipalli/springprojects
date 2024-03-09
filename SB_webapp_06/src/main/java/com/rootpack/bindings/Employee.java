package com.rootpack.bindings;

import lombok.Data;

@Data
public class Employee {
	private String empName;
	private String empMail;
	private long empMobileNo;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public long getEmpMobileNo() {
		return empMobileNo;
	}

	public void setEmpMobileNo(long empMobileNo) {
		this.empMobileNo = empMobileNo;
	}
}
