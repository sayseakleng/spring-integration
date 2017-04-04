package com.kdemo.spring.integration.transformer;

public class Order2 {
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Order2 [description=" + description + "]";
	}
}
