package com.naver.pattern.command;

public class MouseControl {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void click() {
		command.execute();
	}
}
