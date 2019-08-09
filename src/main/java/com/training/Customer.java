package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Customer {

	private long customerId;
	private String customerName;
	private String email;
	private long phoneNumber;
	
	// Field Injection - checks by type and then by name
	@Autowired
	@Qualifier("billingAddress")
	private Address address;
}
