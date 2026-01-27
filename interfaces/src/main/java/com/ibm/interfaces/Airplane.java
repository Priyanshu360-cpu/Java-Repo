package com.ibm.interfaces;

public class Airplane implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("takinf off");

	}

	@Override
	public void land() {
		System.out.println("landing");

	}

	@Override
	public void fly() {
System.out.println("Flying");
	}

}
