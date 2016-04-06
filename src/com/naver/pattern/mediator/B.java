package com.naver.pattern.mediator;

public class B extends Colleague {
	String name = "B";

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
