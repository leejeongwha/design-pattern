package com.naver.pattern.command;

public class ButtonControl {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonPress() {
		command.execute();
	}
}
