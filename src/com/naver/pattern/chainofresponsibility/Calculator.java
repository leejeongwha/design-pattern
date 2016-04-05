package com.naver.pattern.chainofresponsibility;

public abstract class Calculator {
	private Calculator nextCalculator;

	public void setNextCalculator(Calculator nextCalculator) {
		this.nextCalculator = nextCalculator;
	}

	public void process(Request request) {
		if (operator(request)) {
			System.out.println("해당 객체가 처리했음");
		} else {
			if (nextCalculator != null) {
				System.out.println("다음 객체에게 처리 위임함");
				nextCalculator.process(request);

			}
		}
	}

	abstract protected boolean operator(Request request);

}
