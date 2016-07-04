package com.naver.pattern.strategy.four;

public class Main {
	/**
	 * fly와 cry가 동물에 따라 바뀌므로 fly와 cry를 Animal에서 분리하여 인터페이스로 구현. 변하는 부분을 캡슐화하고 해당
	 * 기능을 인터페이스에 위임함. 거북이 추가해보기(CryNoWay, FlyNoway)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Animal tiger = new Tiger();
		tiger.display();
		tiger.performFly();
		tiger.performCry();

		Animal eagle = new Eagle();
		eagle.display();
		eagle.performFly();
		eagle.performCry();
	}
}
