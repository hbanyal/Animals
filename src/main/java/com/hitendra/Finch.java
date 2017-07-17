package com.hitendra;

public class Finch extends Bird implements FlyingBehavior, WalkingBehavior{

	@Override
	public void fly() {
		System.out.println("Finch's implementation of fly..........");
		
	}

	@Override
	public void speak() {
		System.out.println("Finch's implementation of speak..........");
		
	}

	@Override
	public void eat() {
		System.out.println("Finch's implementation of eat..........");
		
	}

	@Override
	public void walk() {
		System.out.println("Finch's implementation of walk..........");
		
	}

	
}
