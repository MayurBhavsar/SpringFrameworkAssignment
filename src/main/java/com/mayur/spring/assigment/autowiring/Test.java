package com.mayur.spring.assigment.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/spring/assigment/autowiring/config.xml");

		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);

		((AbstractApplicationContext) context).close();
	}
}
