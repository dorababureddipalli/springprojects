package com.students.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable>{

}
