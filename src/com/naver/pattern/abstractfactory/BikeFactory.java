package com.naver.pattern.abstractfactory;

public interface BikeFactory {
	public Body createBody();

	public Wheel createWheel();
}
