package com.hitendra;

public class Dog extends Mammal implements WalkingBehavior {

	public Dog() {
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void speak() {
		System.out.println("Dog Barks..........");

	}

	@Override
	public void eat() {
		System.out.println("Dog eats meat ......");

	}

	@Override
	public void walk() {
		System.out.println("Dog's implementation of walking ......");

	}

}
