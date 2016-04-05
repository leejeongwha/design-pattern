package com.naver.pattern.visitor;

public interface HomeTaskElement {
	public void accept(HomeVisitor homeVisitor);
}
