package com.mayur.spring.assigment.autowiring;

public class Reservation {

	private int id;
	private String time;
	
	public Reservation(int id, String time) {
		super();
		this.id = id;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}
}
