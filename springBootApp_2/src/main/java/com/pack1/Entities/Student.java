package com.pack1.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
//@Table
public class Student {
	@Id
	@Column(name = "ROLLNO")
	private Integer rollNo;

	@Column(name = "NAME")
	private String studentName;

	@Column(name = "MARKS")
	private Integer studentMarks;

//	public Integer getRollNo() {
//		return rollNo;
//	}
//
//	public void setRollNo(Integer rollNo) {
//		this.rollNo = rollNo;
//	}
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	public Integer getStudentMarks() {
//		return studentMarks;
//	}
//
//	public void setStudentMarks(Integer studentMarks) {
//		this.studentMarks = studentMarks;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
//	}
//	

}
