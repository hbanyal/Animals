package com.hitendra;

public class Cat extends Mammal implements WalkingBehavior{

	@Override
	public void walk() {
		System.out.println("Cat's implementation of walk..........");
		
	}

	@Override
	public void speak() {
		System.out.println("Cat's implementation of speak..........");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat's implementation of eat..........");
		
	}

	

}
