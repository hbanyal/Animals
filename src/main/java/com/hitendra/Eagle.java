package com.hitendra;

public class Eagle extends Bird implements FlyingBehavior, WalkingBehavior {

	public Eagle() {

	}

	public Eagle(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println("Eagle's implementation of walk..........");

	}

	@Override
	public void fly() {
		System.out.println("Eagle's implementation of fly..........");

	}

	@Override
	public void speak() {
		System.out.println("Eagle's implementation of speak..........");
		
	}

	@Override
	public void eat() {
		System.out.println("Eagle's implementation of eat..........");
		
	}


}
