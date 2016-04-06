package com.naver.pattern.observer1;

import com.naver.pattern.observer1.Button.OnClickListener;

public class Main {
	public static void main(String[] args) {
		Button button = new Button();

		// 익명 클래스를 이용하여 처리
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(Button button) {
				System.out.println(button.getClass().getSimpleName() + " is Clicked!");
			}
		});

		button.onClick();
	}
}
