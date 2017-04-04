package com.kdemo.spring.integration.filter;

import java.util.Date;

public class OrderService {
	
	public Order order(Order order) {
		System.out.printf("You are making an order: %s%n", order);
		
		order.setOrderDate(new Date());
		
		return order;
	}
	
	public void receive(Order order) {
		System.out.printf("You made an order: %s%n", order);
	}
}
