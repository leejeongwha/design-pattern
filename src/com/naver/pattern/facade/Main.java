package com.naver.pattern.facade;

import com.naver.pattern.facade.system.Computer;

public class Main {
	/**
	 * 인터페이스를 단순화!!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Computer facade = new Computer();
		facade.startComputer();
	}
}
