package com.estockMarket.stockService.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockRestModel {

	private String companyCode;
	private BigDecimal stockPrice;
	public StockRestModel() {
		super();
	}
	public StockRestModel(String companyCode, BigDecimal stockPrice) {
		super();
		this.companyCode = companyCode;
		this.stockPrice = stockPrice;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public BigDecimal getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(BigDecimal stockPrice) {
		this.stockPrice = stockPrice;
	}

}
