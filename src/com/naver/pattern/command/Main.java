package com.naver.pattern.command;

public class Main {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		WarriorBattleCommand warriorBattleCommand = new WarriorBattleCommand(warrior);
		WarriorDefenceCommand warriorDefenceCommand = new WarriorDefenceCommand(warrior);

		ButtonControl bc = new ButtonControl();
		bc.setCommand(warriorBattleCommand);
		bc.buttonPress();
		bc.setCommand(warriorDefenceCommand);
		bc.buttonPress();

		// 마우스 컨트롤이 추가 되더라도 command의 execute메서드만 실행하면 된다는 것을 알고 있음
		MouseControl mc = new MouseControl();
		mc.setCommand(warriorBattleCommand);
		mc.click();
		mc.setCommand(warriorDefenceCommand);
		mc.click();
	}
}
