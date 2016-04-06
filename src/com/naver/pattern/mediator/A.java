package com.naver.pattern.mediator;

public class A extends Colleague {
	String name = "A";

	@Override
	public void fireEvent(String event) {
		mediator.sendEvent(name, event);
	}

	@Override
	public void receiveEvent(String name, String event) {
		System.out.println("Receive " + event + " from " + name);
	}

	@Override
	public String getName() {
		return name;
	}

}
