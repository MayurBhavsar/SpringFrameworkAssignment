package com.mayur.spring.assigment.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mayur/spring/assigment/lifecycle/config.xml");
		
		TicketResevation passenger = (TicketResevation)context.getBean("ticket");
		System.out.println(passenger);
		context.registerShutdownHook();
		context.close();
	}

}
