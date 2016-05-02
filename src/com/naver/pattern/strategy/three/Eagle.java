package com.naver.pattern.strategy.three;

public class Eagle extends Bird {

	@Override
	void cry() {
		System.out.println("꾸엑");
	}

	@Override
	void display() {
		System.out.println("독수리");
	}
}
