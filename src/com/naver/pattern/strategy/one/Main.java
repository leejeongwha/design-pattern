package com.naver.pattern.strategy.one;

public class Main {

	/**
	 * 여기에 날아가기 기능을 추가한다면?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.cry();
		tiger.display();

		Eagle eagle = new Eagle();
		eagle.cry();
		eagle.display();
	}

}
