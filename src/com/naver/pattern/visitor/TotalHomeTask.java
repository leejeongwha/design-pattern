package com.naver.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class TotalHomeTask implements HomeTaskElement {
	ArrayList<HomeTaskElement> homeTaskElements = new ArrayList<HomeTaskElement>();

	public TotalHomeTask() {
		homeTaskElements.add(new CleanTask());
		homeTaskElements.add(new CookTask());
		homeTaskElements.add(new BabyCareTask());
	}

	/*
	 * 각 Task별로 파라미터로 넘겨받은 Visitor의 visit메서드를 호출
	 * 
	 * @see com.naver.pattern.visitor.HomeTaskElement#accept(com.naver.pattern.
	 * visitor.HomeVisitor)
	 */
	@Override
	public void accept(HomeVisitor homeVisitor) {
		Iterator it = homeTaskElements.iterator();
		while (it.hasNext()) {
			HomeTaskElement homeTaskElement = (HomeTaskElement) it.next();
			homeTaskElement.accept(homeVisitor);
		}
	}
}
