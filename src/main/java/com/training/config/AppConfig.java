package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.Address;
import com.training.Customer;
import com.training.OrderBook;
import com.training.Product;

@Configuration
public class AppConfig {
	@Bean
	public Customer customer() {
		//setter dependencies of simple values
		Customer customer = new Customer();
		customer.setCustomerId(929);
		customer.setCustomerName("Janani");
		customer.setEmail("jan@cal.com");
		customer.setPhoneNumber(92954433);
		return customer;
	}
	
	@Bean
	public Product tv() {
		//constructor dependencies of simple values
		return new Product(101,"Sony TV",1,45000.00);
	}
	
	@Bean
	public Product laptop() {
		//constructor dependencies of simple values
		return new Product(103,"Sony Vivo",1,85000.00);
	}
	
	@Bean
	public Product mobile() {
		//constructor dependencies of simple values
		return new Product(105,"Sony Mobile",1,6000.00);
	}

	@Bean(initMethod="init", destroyMethod="destroy")
	public OrderBook orderBook() {
		//Constructor dependencies of simple values and collaborating object
		//return new OrderBook(766,customer(),product());
		OrderBook orderBook = new OrderBook();
		orderBook.setCust(customer());
		orderBook.setOrderId(2020);
		return orderBook;
	}
	
	@Bean
	public Address billingAddress() {
		return new Address("1, Gandhi street","Chennai", 699999);
	}
	
	@Bean
	public Address shippingAddress() {
		return new Address("1, Nehru Nagar","Chennai", 600001);
	}
}
