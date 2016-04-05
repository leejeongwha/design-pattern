package com.naver.pattern.visitor;

public class Main {

	public static void main(String[] args) {
		TotalHomeTask totalHomeTask = new TotalHomeTask();
		totalHomeTask.accept(new ACompanyVisitor());
		// totalHomeTask.accept(new BCompanyVisitor());
	}
}
