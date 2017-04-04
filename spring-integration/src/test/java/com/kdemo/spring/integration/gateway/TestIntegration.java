package com.kdemo.spring.integration.gateway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("context.xml")
public class TestIntegration {

	
	@Autowired
	private OrderServiceGateway orderServiceGateway;
	
	
	@Test
	public void test() throws InterruptedException {
		Order order = orderServiceGateway.order(new Order());
		
		System.out.println(order);
	}

}
