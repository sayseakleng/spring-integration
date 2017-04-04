package com.kdemo.spring.integration.filter;

import org.springframework.integration.core.GenericSelector;

public class OrderFilter implements GenericSelector<Order> {

	@Override
	public boolean accept(Order source) {
		
		if(source.getOrderDate() == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
