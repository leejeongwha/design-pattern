package com.naver.pattern.strategy.one;

public class Tiger extends Animal {

	@Override
	void cry() {
		System.out.println("어흥");
	}

	@Override
	void display() {
		System.out.println("호랑이");
	}
}
