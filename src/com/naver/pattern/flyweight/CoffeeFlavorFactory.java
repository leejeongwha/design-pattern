package com.naver.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFlavorFactory {
	private Map<String, CoffeeFlavor> flavors = new HashMap<String, CoffeeFlavor>();

	public CoffeeFlavor getCoffeeFlavor(String flavorName) {
		CoffeeFlavor flavor = flavors.get(flavorName);

		// Map에 없는 경우에만 객체 생성
		if (flavor == null) {
			flavor = new CoffeeFlavor(flavorName);
			flavors.put(flavorName, flavor);
		}
		return flavor;
	}

	public int getTotalCoffeeFlavorsMade() {
		return flavors.size();
	}
}
