package com.naver.pattern.mediator;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		Mediator m = new Mediator();
		m.addColleague(a);
		m.addColleague(b);
		m.addColleague(c);

		m.sendEvent("B", "Hello");
		a.fireEvent("ReceiveMail");
	}
}
