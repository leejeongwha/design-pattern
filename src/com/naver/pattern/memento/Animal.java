package com.naver.pattern.memento;

public class Animal {
	private String name;
	private String color;
	private int weight;

	public Animal(String name, String color, int weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
}