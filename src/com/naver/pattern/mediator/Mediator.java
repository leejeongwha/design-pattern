package com.naver.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
	private List<Colleague> colleagues = new ArrayList<Colleague>();

	public Mediator() {
	}

	public void addColleague(Colleague a) {
		a.setMediator(this);
		colleagues.add(a);
	}

	@Override
	public void sendEvent(String name, String event) {
		for (Colleague s : colleagues) {
			if (s.getName() == name) {
				s.receiveEvent(name, event);
			}
		}
		// 기존의 복잡성 증가의 코드
		// switch (name) {
		// case "A":
		// a.receiveEvent(name, event);
		// break;
		// case "B":
		// b.receiveEvent(name, event);
		// break;
		// case "C":
		// c.receiveEvent(name, event);
		// break;
		// }

	}

}
