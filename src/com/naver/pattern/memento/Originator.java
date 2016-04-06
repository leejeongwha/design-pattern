package com.naver.pattern.memento;

/**
 * 메멘토를 생성, 복원하고, 대상 객체로 세팅
 * 
 * @author NAVER
 *
 */
public class Originator {
	Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Memento createMemento() {
		return new Memento(animal);
	}

	public void restoreMemento(Memento memento) {
		animal = memento.getAnimal();
	}

	@Override
	public String toString() {
		return "Originator [animal=" + animal + "]";
	}

}
