package com.naver.pattern.bridge;

public class Main {

	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new SoundMCF());
		code.g().a().r().a().m();

	}

}
