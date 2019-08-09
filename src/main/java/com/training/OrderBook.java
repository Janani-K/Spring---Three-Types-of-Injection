package com.training;


import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class OrderBook {
	private long orderId;
	private Customer cust;
	
	Logger log = Logger.getAnonymousLogger();
	
	@Autowired
	private List<Product> product;
	
	public void init() {
		log.info("Init method called!!!");
	}
	
	public void destroy() {
		log.info("Destroy method called!!!");
	}
	
}
