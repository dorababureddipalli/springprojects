package com.pack1.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack1.Entities.Student;


public interface Student_Dao extends JpaRepository<Student, Serializable> {
	//@Query("")
	
	//this method will generate the following query
	//select studentMarks from Student where studentRollNo=:roll; 
	//@Query("select studentMarks from Student where rollNo=?")
	public Student findByrollNo(Integer rollNo);
}
