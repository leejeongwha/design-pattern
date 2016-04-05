package com.naver.pattern.decorator;

public class Espresso extends AbstAdding {
	protected static int espressoCount = 0;

	public Espresso(IBeverage meterial) {
		super(meterial);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + getAddPrice();
	}

	/**
	 * 1번일때는 100증가 2번이상일때는 70 증가
	 * 
	 * @return
	 */
	private static int getAddPrice() {
		espressoCount += 1;
		int addPrice = 100;

		if (espressoCount > 1) {
			addPrice = 70;
		}

		return addPrice;
	}
}
