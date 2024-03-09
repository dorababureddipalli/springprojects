package com.pojos;

public class Stock {
	private String stockCompanyName;
	private Integer stockQuantity;

	public String getStockCompanyName() {
		return stockCompanyName;
	}

	public void setStockCompanyName(String stockCompanyName) {
		this.stockCompanyName = stockCompanyName;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	@Override
	public String toString() {
		return "Stock [stockCompanyName=" + stockCompanyName + ", stockQuantity=" + stockQuantity + "]";
	}

}
