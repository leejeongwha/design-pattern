package com.naver.pattern.strategy.one;

public class Eagle extends Animal {

	@Override
	void cry() {
		System.out.println("꾸엑");
	}

	@Override
	void display() {
		System.out.println("독수리");
	}
}
