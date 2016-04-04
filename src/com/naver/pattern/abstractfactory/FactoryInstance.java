package com.naver.pattern.abstractfactory;

import com.naver.pattern.abstractfactory.sam.SamFactory;

public class FactoryInstance {
	public static BikeFactory getBikeFactory() {
		// 여기에서 분기를 태울 수 있음
		return new SamFactory();
	}

}
