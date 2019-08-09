package com.training;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Address {
	
	private String addressLine1;
	private String city;
	private long pinCode;
}
