package com.naver.pattern.abstractfactory.sam;

import com.naver.pattern.abstractfactory.BikeFactory;
import com.naver.pattern.abstractfactory.Body;
import com.naver.pattern.abstractfactory.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}

}
