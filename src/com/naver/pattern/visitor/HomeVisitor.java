package com.naver.pattern.visitor;

public interface HomeVisitor {
	public void visit(CleanTask cleanTask);

	public void visit(CookTask cookTask);

	public void visit(BabyCareTask babyCareTask);
}
