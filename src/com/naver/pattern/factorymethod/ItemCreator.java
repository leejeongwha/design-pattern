package com.naver.pattern.factorymethod;

public abstract class ItemCreator {
	// 팩토리메서드
	public Item create() {
		Item item;

		// step1
		requestItemsInfo();
		// step2
		item = cteateItem();
		// step3
		createItemLog();

		return item;
	}

	// db에서 아이템 요청
	abstract protected void requestItemsInfo();

	// db에 아이템 생성
	abstract protected void createItemLog();

	// 아이템 생성 알고리즘
	abstract protected Item cteateItem();

}
