package com.naver.pattern.observer2;

import java.util.Observable;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		Button button = new Button();

		button.addObserver(new Observer() {
			@Override
			public void update(Observable o, Object arg) {
				System.out.println(o + " is clicked");
			}
		});

		button.onClick();
		button.onClick();
	}
}
