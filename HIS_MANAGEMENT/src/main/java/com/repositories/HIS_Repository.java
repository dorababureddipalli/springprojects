package com.repositories;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entities.HIS_CaseWorker;

public interface HIS_Repository extends JpaRepository<HIS_CaseWorker, Serializable> {
	
	
	@Query(value = "SELECT * FROM HIS_CASEWORKER WHERE E_MAIL= :eMail", nativeQuery = true)
	public Optional<HIS_CaseWorker>   findByeMail(@Param("eMail") String eMail);

	Page<HIS_CaseWorker> findByRole(String role,Pageable p);

//	@Query(value = "UPDATE HIS_CASEWORKER
//			SET PASSWORD = 'new_password', ACC_STATUS = 'active'
//			WHERE E_MAIL = 'example@email.com'", nativeQuery = true)

//	@Modifying
//	@Query(value="UPDATE HIS_CASEWORKER SET PASSWORD = :password, ACC_STATUS = :accStatus WHERE E_MAIL = :eMail")
//	void updatePasswordAndAccStatus(@Param("password") String password, @Param("accStatus") String accStatus,
//			@Param("eMail") String eMail);
	
	
	
	@Query(value = "SELECT * FROM HIS_CASEWORKER WHERE E_MAIL= :eMail AND PASSWORD=:password", nativeQuery = true)
	public Optional<HIS_CaseWorker> findByEmailAndPassword(@Param("eMail") String eMail,@Param("password") String password);
}
