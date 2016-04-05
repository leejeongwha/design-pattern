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

	@Override
	public void accept(HomeVisitor homeVisitor) {
		Iterator it = homeTaskElements.iterator();
		while (it.hasNext()) {
			HomeTaskElement homeTaskElement = (HomeTaskElement) it.next();
			homeTaskElement.accept(homeVisitor);
		}
	}
}
