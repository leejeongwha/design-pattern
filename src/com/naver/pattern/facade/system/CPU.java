package com.naver.pattern.facade.system;

class CPU {
	public void freeze() {
		System.out.println("cpu freeze");
	}

	public void jump(long position) {
		System.out.println("cpu jumps to " + position);
	}

	public void execute() {
		System.out.println("cpu 실행");
	}
}
