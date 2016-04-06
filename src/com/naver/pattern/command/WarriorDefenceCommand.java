package com.naver.pattern.command;

public class WarriorDefenceCommand implements Command {
	Warrior warrior;

	public WarriorDefenceCommand(Warrior warrior) {
		this.warrior = warrior;
	}

	@Override
	public void execute() {
		warrior.guard();
	}
}
