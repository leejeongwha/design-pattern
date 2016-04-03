package com.naver.pattern.adapter;

public class AdapterImpl implements Adapter {

	@Override
	public Float halfOf(Float f) {
		System.out.println("절반 함수 호출 시작");
		return (float) Math.half(f.doubleValue());
	}

	@Override
	public Float twiceOf(Float f) {
		// return (float) Math.twoTime(f.doubleValue());

		return Math.doubled(f.doubleValue()).floatValue();
	}

}
