package com.ibm.enums.types;

public enum Apples {
	RED_DEL(100),
	GOLDEN_DEL(200),
	FUJI(50),
	GREEN(10);
	private int price;
	private Apples(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
}
