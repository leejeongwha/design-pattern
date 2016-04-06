package com.naver.pattern.command;

public class WarriorBattleCommand implements Command {
	Warrior warrior;

	public WarriorBattleCommand(Warrior warrior) {
		this.warrior = warrior;
	}

	@Override
	public void execute() {
		warrior.attack();
	}
}
