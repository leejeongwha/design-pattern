package com.naver.pattern.facade;

import com.naver.pattern.facade.system.Computer;

public class Main {
	public static void main(String[] args) {
		Computer facade = new Computer();
		facade.startComputer();
	}
}
