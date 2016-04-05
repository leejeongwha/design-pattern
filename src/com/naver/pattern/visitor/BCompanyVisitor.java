package com.naver.pattern.visitor;

public class BCompanyVisitor implements HomeVisitor {
	@Override
	public void visit(CleanTask cleanTask) {
		System.out.println("BCompany cleanTask");
	};

	@Override
	public void visit(CookTask cookTask) {
		System.out.println("BCompany cookTask");
	};

	@Override
	public void visit(BabyCareTask babyCareTask) {
		System.out.println("BCompany babyCareTask");
	};
}
