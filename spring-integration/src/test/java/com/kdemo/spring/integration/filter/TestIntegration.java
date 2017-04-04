package com.kdemo.spring.integration.filter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("context.xml")
public class TestIntegration {

	@Autowired
	private MessageChannel inputChannel;
	
	
	@Test
	public void test() throws InterruptedException {
		Message<Order> message = MessageBuilder
				.withPayload(new Order())
				.build();
		boolean send = inputChannel.send(message);
		
		System.out.println(send);
		
		Thread.sleep(500);
		
	}

}
