package com.naver.pattern.decorator;

public class Milk extends AbstAdding {
	public Milk(IBeverage meterial) {
		super(meterial);
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return super.getTotalPrice() + 50;
	}
}
