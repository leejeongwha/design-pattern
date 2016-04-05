package com.naver.pattern.visitor;

public class CleanTask implements HomeTaskElement {

	@Override
	public void accept(HomeVisitor homeVisitor) {
		homeVisitor.visit(this);
	}
}
