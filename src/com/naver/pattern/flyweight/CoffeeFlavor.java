package com.naver.pattern.flyweight;

public class CoffeeFlavor implements CoffeeOrder {
	private String flavor;

	public CoffeeFlavor(String newFlavor) {
		this.flavor = newFlavor;
	}

	public String getFlavor() {
		return this.flavor;
	}

	@Override
	public void serveCoffee(CoffeeOrderContext context) {
		System.out.println("Serving Coffee flavor " + flavor + " to table number " + context.getTable());
	}

}
