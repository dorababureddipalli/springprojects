package com.acoder.pojo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMP")
public class EmployeeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMPNO")
	private String empNo;

	@Column(name = "ENAME")
	private String empName;

	@Column(name = "MGR")
	private Integer empMGR;

	@Column(name = "SAL")
	private Double empSal;

	@Column(name = "HIREDATE")
	private Date hireDate;

	@Column(name = "JOB")
	private String empJob;

	@Column(name = "DEPTNO")
	private Integer empDeptno;

	@Column(name = "COMM")
	private Integer empComm;

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpMGR() {
		return empMGR;
	}

	public void setEmpMGR(Integer empMGR) {
		this.empMGR = empMGR;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getEmpJob() {
		return empJob;
	}

	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

	public Integer getEmpDeptno() {
		return empDeptno;
	}

	public void setEmpDeptno(Integer empDeptno) {
		this.empDeptno = empDeptno;
	}

	public Integer getEmpComm() {
		return empComm;
	}

	public void setEmpComm(Integer empComm) {
		this.empComm = empComm;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empNo=" + empNo + ", empName=" + empName + ", empMGR=" + empMGR + ", empSal=" + empSal
				+ ", hireDate=" + hireDate + ", empJob=" + empJob + ", empDeptno=" + empDeptno + ", empComm=" + empComm
				+ "]";
	}

}
