package com.naver.pattern.facade.system;

class Memory {
	public void load(long position, byte[] data) {
		System.out.println("메모리 위치 " + position + "에 " + data.toString() + " 데이터를 올림");
	}
}
