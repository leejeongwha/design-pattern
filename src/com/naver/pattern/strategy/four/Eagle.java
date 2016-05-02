package com.naver.pattern.strategy.four;

public class Eagle extends Animal {

	public Eagle() {
		cry = new BirdCry();

		fly = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("독수리");
	}
}
