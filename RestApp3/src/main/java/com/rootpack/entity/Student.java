package com.rootpack.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "Student_Details")
@Table(name = "Student_Details")
public class Student {

	@Id
	@GeneratedValue
	//@Column(name = "Student_Id")
	private Integer sID;

	//@Column(name = "Student_Name")
	private String sName;

	//@Column(name = "Student_Gender")
	private Character sGender;

	//@Column(name = "Student_Education")
	private String sEducation;

	//@Column(name = "Student_Course")
	private String sCourse;

	//@Column(name = "Student_Passout")
	private String sYOFPassOut;
	
	@ElementCollection
	@CollectionTable(name="skill_tab")
	//@Column(name="USERROLE")//element column
	//@Column(name = "Student_Skills")
	private List<String> sSkills;

	//@Column(name = "Student_Mobileno")
	private Long sMobileNo;

	//@Column(name = "Student_Email")
	private String sEmail;

	//@Column(name = "Student_Percentage")
	private Integer sPercentage;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Character getsGender() {
		return sGender;
	}

	public void setsGender(Character sGender) {
		this.sGender = sGender;
	}

	public String getsEducation() {
		return sEducation;
	}

	public void setsEducation(String sEducation) {
		this.sEducation = sEducation;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	public String getsYOFPassOut() {
		return sYOFPassOut;
	}

	public void setsYOFPassOut(String sYOFPassOut) {
		this.sYOFPassOut = sYOFPassOut;
	}

	public List<String> getsSkills() {
		return sSkills;
	}

	public void setsSkills(List<String> sSkills) {
		this.sSkills = sSkills;
	}

	public Long getsMobileNo() {
		return sMobileNo;
	}

	public void setsMobileNo(Long sMobileNo) {
		this.sMobileNo = sMobileNo;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public Integer getsPercentage() {
		return sPercentage;
	}

	public void setsPercentage(Integer sPercentage) {
		this.sPercentage = sPercentage;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sGender=" + sGender + ", sEducation=" + sEducation + ", sCourse="
				+ sCourse + ", sYOFPassOut=" + sYOFPassOut + ", sSkills=" + sSkills + ", sMobileNo=" + sMobileNo
				+ ", sEmail=" + sEmail + ", sPercentage=" + sPercentage + "]";
	}

}
