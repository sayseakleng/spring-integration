package com.kdemo.spring.integration.filter;

import java.util.Date;

public class Order {
	private Date orderDate;

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + "]";
	}
}
