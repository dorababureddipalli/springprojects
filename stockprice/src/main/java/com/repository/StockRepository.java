package com.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.StockPriceEntity;

public interface StockRepository extends JpaRepository<StockPriceEntity, Serializable>{
	public StockPriceEntity findByCompanyName(String companyName);
}
