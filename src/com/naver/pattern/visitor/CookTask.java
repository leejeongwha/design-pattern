package com.naver.pattern.visitor;

public class CookTask implements HomeTaskElement {

	@Override
	public void accept(HomeVisitor homeVisitor) {
		homeVisitor.visit(this);
	}
}
