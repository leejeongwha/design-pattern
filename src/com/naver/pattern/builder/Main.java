package com.naver.pattern.builder;

public class Main {

	public static void main(String[] args) {
		// 아래와 같이 파라미터 순서가 헷갈릴 수 있음
		// Computer computer = new Computer("4g", "i7", "256g ssd");

		Computer computer = ComputerBuilder.start().setCpu("i7").setRam("4g").setStorage("256g ssd").build();

		System.out.println(computer.toString());
	}

}
