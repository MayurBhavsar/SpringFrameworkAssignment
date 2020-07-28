package com.mayur.spring.assigment.dependencyandscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mayur/spring/assigment/dependencyandscope/config.xml");
		
		University university = (University)context.getBean("university");
		System.out.println(university.hashCode());
		University university2 = (University)context.getBean("university");
		System.out.println(university2.hashCode());
		((AbstractApplicationContext) context).close();
	}

}
