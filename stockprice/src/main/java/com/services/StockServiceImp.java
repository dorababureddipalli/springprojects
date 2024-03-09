package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.StockPriceEntity;
import com.exceptions.CompanyNotFoundException;
import com.repository.StockRepository;

@Service
public class StockServiceImp implements StockService {
	@Autowired
	private StockRepository stockRepo;

	@Override
	public Double getStockPrice(String companyName) {
		 StockPriceEntity findByCompanyName = stockRepo.findByCompanyName(companyName);
		 if(findByCompanyName==null)
			 throw new CompanyNotFoundException("company not available");
		return	findByCompanyName.getCompanyPrice();
	}

}
