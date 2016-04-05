package com.naver.pattern.visitor;

public class BabyCareTask implements HomeTaskElement {

	@Override
	public void accept(HomeVisitor homeVisitor) {
		homeVisitor.visit(this);

	}

}
