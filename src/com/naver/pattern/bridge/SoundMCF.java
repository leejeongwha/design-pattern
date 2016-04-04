package com.naver.pattern.bridge;

public class SoundMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print("삐");
	}

	@Override
	public void dash() {
		System.out.print("뚜");
	}

	@Override
	public void space() {
		System.out.print("음");
	}

}
