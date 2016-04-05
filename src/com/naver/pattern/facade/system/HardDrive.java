package com.naver.pattern.facade.system;

class HardDrive {
	public byte[] read(long lba, int size) {
		System.out.println(size + "섹터 만큼 논리 block 주소(" + lba + ")로부터 데이터를 읽어옴");
		return "complete".getBytes();
	}
}
