package com.naver.pattern.observer2;

import java.util.Observable;

public class Button extends Observable {
	public void onClick() {
		// setChanged가 없으면 동작하지 않음
		setChanged();
		notifyObservers();
	}
}
