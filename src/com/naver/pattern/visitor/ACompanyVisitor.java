package com.naver.pattern.visitor;

public class ACompanyVisitor implements HomeVisitor {
	@Override
	public void visit(CleanTask cleanTask) {
		System.out.println("ACompany cleanTask");
	}

	@Override
	public void visit(CookTask cookTask) {
		System.out.println("ACompany cookTask");
	}

	@Override
	public void visit(BabyCareTask babyCareTask) {
		System.out.println("ACompany babyCareTask");
	}

}
