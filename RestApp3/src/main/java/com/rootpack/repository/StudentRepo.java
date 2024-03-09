package com.rootpack.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rootpack.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Serializable>{

}
