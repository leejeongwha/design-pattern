package com.naver.pattern.strategy.four;

public class Tiger extends Animal {

	public Tiger() {
		cry = new TigerCry();

		fly = new FlyNoway();
	}

	@Override
	public void display() {
		System.out.println("호랑이");
	}
}
