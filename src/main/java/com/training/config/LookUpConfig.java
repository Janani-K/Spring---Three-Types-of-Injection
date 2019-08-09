package com.training.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.DiscountNotification;
import com.training.DiscountService;

@Configuration
public class LookUpConfig {
	
	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // for case issues // use "prototype" instead if sure about the spelling
	public DiscountNotification notification() {
		return new DiscountNotification();
	}
	
	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public DiscountService service() { 	
		//anonymous class
		return new DiscountService() {
			
			@Override
			public DiscountNotification getDiscount(String itemName) {
				return new DiscountNotification (itemName);
			}
		};
	}

}
