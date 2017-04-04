package com.kdemo.spring.integration.transformer;

import org.springframework.integration.transformer.GenericTransformer;

public class Order1ToOrder2Transformer 
	implements GenericTransformer<Order1, Order2> {

	@Override
	public Order2 transform(Order1 source) {
		
		Order2 order2 = new Order2();
		order2.setDescription(source.getDesc());
		
		return order2;
	}

}
