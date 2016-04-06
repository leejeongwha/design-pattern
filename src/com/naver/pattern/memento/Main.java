package com.naver.pattern.memento;

public class Main {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setAnimal(new Animal("dog", "white", 5));

		CareTaker caretaker = new CareTaker();
		caretaker.addMemento(originator.createMemento());

		originator.setAnimal(new Animal("cat", "black", 3));
		caretaker.addMemento(originator.createMemento());

		originator.setAnimal(new Animal("iguana", "green", 1));
		System.out.println("\nOriginator current state : " + originator);

		System.out.println("\nOriginator restoring to dog");
		originator.restoreMemento(caretaker.getMemento(0));
		System.out.println("\nOriginator current state : " + originator);
	}
}
