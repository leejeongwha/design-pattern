package com.naver.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> animalList = new ArrayList<Memento>();

	public void addMemento(Memento m) {
		animalList.add(m);
		System.out.println("Animal's snapshots Maintained by CareTaker : " + animalList);
	}

	public Memento getMemento(int index) {
		return animalList.get(index);
	}
}
