package com.naver.pattern.strategy.four;

public abstract class Animal {
	protected Fly fly;

	protected Cry cry;

	public Animal() {

	}

	public void performFly() {
		fly.fly();
	}

	public void performCry() {
		cry.cry();
	}

	public void move() {
		System.out.println("움직인다.");
	}

	public abstract void display();
}
