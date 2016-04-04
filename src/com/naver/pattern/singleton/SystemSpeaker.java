package com.naver.pattern.singleton;

public class SystemSpeaker {
	private static SystemSpeaker instance;
	private int volume;

	// 외부에서 호출하지 못하도록 private
	private SystemSpeaker() {
		volume = 5;
	}

	public static SystemSpeaker getInstance() {
		if (instance == null) {
			System.out.println("새로생성");
			instance = new SystemSpeaker();
		} else {
			System.out.println("이미생성");
		}

		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
