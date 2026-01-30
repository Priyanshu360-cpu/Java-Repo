package com.ibm.spring.beans;

public class SpellChecker {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int d) {
		this.id=id;
	}
	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor");
	}
	public void checkSpelling() {
		System.out.println("Inside checkSpelling");
	}
}
