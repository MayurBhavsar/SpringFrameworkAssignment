package com.mayur.spring.assigment.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String name;
	@Autowired
	private Reservation reservation;

	
	public Customer(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}
}
