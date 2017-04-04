package com.kdemo.spring.integration.transformer;

import java.util.Date;

public class Order1 {
	
	private String desc;
	private Date date;
	
	public Order1() {
	}
	
	public Order1(String desc, Date orderDate) {
		this.desc = desc;
		this.date = orderDate;
	}
	public String getDesc() {
		return desc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Order1 [desc=" + desc + ", date=" + date + "]";
	}
}
