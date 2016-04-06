package com.naver.pattern.mediator;

abstract class Colleague {
	public IMediator mediator;

	public void setMediator(IMediator im) {
		this.mediator = im;
	}

	public void sendEvent(String name, String event) {
		mediator.sendEvent(name, event);
	}

	abstract public void fireEvent(String event);

	abstract public void receiveEvent(String name, String event);

	abstract public String getName();
}
