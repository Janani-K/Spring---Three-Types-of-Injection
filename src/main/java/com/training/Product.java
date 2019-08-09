package com.training;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private long productCode;
	private String productName;
	private double quantity;
	private double ratePerUnit;
}
