package com.naver.pattern.abstractfactory;

public class Main {

	public static void main(String[] args) {
		BikeFactory factory = FactoryInstance.getBikeFactory();

		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();

		System.out.println(body.getClass());
		System.out.println(wheel.getClass());

	}
}
