package com.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.SsaEnrollment;

public interface SsaEnrollmentRepository extends JpaRepository<SsaEnrollment, Serializable> {
	
	public SsaEnrollment findByssaNo(Long ssaNo);
}
