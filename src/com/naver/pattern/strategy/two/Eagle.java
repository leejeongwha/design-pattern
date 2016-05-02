package com.naver.pattern.strategy.two;

public class Eagle extends Animal implements Fly {

	@Override
	void cry() {
		System.out.println("꾸엑");
	}

	@Override
	void display() {
		System.out.println("독수리");
	}

	@Override
	public void fly() {
		System.out.println("날아간다");
	}
}
