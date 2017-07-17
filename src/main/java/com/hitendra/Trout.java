package com.hitendra;

public class Trout extends Fish implements SwimmingBehavior{

	@Override
	public void swim() {
		System.out.println("Trout's implementation of swim..........");
		
	}

	@Override
	public void speak() {
		System.out.println("Trout's implementation of speak..........");
		
	}

	@Override
	public void eat() {
		System.out.println("Trout's implementation of eat..........");
		
	}

	
}
