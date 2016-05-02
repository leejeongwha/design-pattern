package com.naver.pattern.strategy.three;

public class Main {

	/**
	 * fly 메서드 호출 시 '날아간다'에서 '날개를 펄럭이며 날아간다'로 변경하려면 Bird클래스만 수정하면 됨. But 날지 못하는
	 * 새들은 Bird클래스를 상속하면 안된다. 날지못하는 새 그룹을 새로 추가하는 것도 비효율적이다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.cry();
		tiger.display();

		Bird eagle = new Eagle();
		eagle.cry();
		eagle.display();
		eagle.fly();
	}

}
