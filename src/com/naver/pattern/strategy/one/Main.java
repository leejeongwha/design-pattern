package com.naver.pattern.strategy.one;

public class Main {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.cry();
		tiger.display();

		Eagle eagle = new Eagle();
		eagle.cry();
		eagle.display();
	}

}
