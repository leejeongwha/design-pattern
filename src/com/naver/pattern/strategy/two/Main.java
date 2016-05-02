package com.naver.pattern.strategy.two;

public class Main {

	/**
	 * fly 기능을 인터페이스로 만들어 구현 - 인터페이스 사용 fly 함수. But fly 함수 구현 내용이 변경 될 경우 모든
	 * 객체들에 변경이 필요함
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
		eagle.fly();
	}

}
