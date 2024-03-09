package com.clients;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("stock-Price")
@LoadBalancerClient("stock-Price")
public interface StockPriceClient {
	@GetMapping(value="price/stockprice/{companyName}")
	public Double getStockPrice(@PathVariable("companyName") String companyName);
}
