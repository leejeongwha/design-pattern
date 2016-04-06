package com.naver.pattern.memento;

public class Memento {
	private Animal animal;

	public Memento(Animal animal) {
		super();
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Memento [animal=" + animal + "]";
	}

}
