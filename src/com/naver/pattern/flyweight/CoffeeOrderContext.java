package com.naver.pattern.flyweight;

public class CoffeeOrderContext {
	private int tableNumber;

	public CoffeeOrderContext(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getTable() {
		return this.tableNumber;
	}
}
