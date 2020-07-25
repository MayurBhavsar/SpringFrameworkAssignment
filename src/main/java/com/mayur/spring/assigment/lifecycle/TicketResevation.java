package com.mayur.spring.assigment.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketResevation {

	private int ticketId;

	public TicketResevation(int ticketId) {
		super();
		this.ticketId = ticketId;
	}

	@PostConstruct
	public void initialize() {
		
		System.out.println("In initialize() method");
	}
	
	@PreDestroy
	public void cleanUp() {
		
		System.out.println("In cleanUp() method");
	}
	
	@Override
	public String toString() {
		return "TicketResevation [ticketId=" + ticketId + "]";
	}
	
}
