package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STOCK_PRICE")
public class StockPriceEntity {
	@Id
	@Column(name = "Stock_Id")
	private Integer stockId;

	@Column(name = "Company_Name")
	private String companyName;

	@Column(name = "Company_Price")
	private Double companyPrice;

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCompanyPrice() {
		return companyPrice;
	}

	public void setCompanyPrice(Double companyPrice) {
		this.companyPrice = companyPrice;
	}

	@Override
	public String toString() {
		return "StockPriceEntity [stockId=" + stockId + ", companyName=" + companyName + ", companyPrice="
				+ companyPrice + "]";
	}

}
