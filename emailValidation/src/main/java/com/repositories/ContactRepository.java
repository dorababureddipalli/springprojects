package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
//	@Query(value = "select * from CONTACTS where CONTACT_EMAIL='contactEmail'")
//	public String findBycontactEmail(@Param("contactEmail") String contactEmail);

	@Query(value = "SELECT * FROM CONTACTS WHERE CONTACT_EMAIL = :contactEmail", nativeQuery = true)
	public String findByContactEmail(@Param("contactEmail") String contactEmail);
}
