package com.kdemo.spring.integration.transformer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("context.xml")
public class TestIntegration {

	@Autowired
	private MessageChannel inputChannel;
	
	@Autowired
	private PollableChannel outputChannel2;
	
	@Test
	public void test() throws InterruptedException {
		
		Message<Order1> message = MessageBuilder
				.withPayload(new Order1("a", null))
				.build();
		
		boolean send = inputChannel.send(message);
		
		System.out.println(send);
		
		
		Message<?> receive = outputChannel2.receive(1000);
		Order2 payload = (Order2) receive.getPayload();
		System.out.println(payload);
	}

}
