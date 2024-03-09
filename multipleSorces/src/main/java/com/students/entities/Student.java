package com.students.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "student_Info")
public class Student {
	@Id
	private Integer studentId;
	
	private String studentName;
	
	private double studentGPA;
	
	

	public Student(Integer studentId, String studentName, double studentGPA) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGPA = studentGPA;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentGPA() {
		return studentGPA;
	}

	public void setStudentGPA(double studentGPA) {
		this.studentGPA = studentGPA;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGPA=" + studentGPA + "]";
	}
}
