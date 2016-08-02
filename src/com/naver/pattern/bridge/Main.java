package com.naver.pattern.bridge;

public class Main {

	/**
	 * 추상적 개념인 PrintMorseCode와 구체적 구현인 MorseCodeFunction을 분리
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new SoundMCF());
		code.g().a().r().a().m();

	}

}
