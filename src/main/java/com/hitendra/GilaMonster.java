package com.hitendra;

public class GilaMonster extends Reptile implements WalkingBehavior{

	@Override
	public void walk() {
		System.out.println("GilaMonster's implementation of walk..........");
		
	}

	@Override
	public void speak() {
		System.out.println("GilaMonster's implementation of speak..........");
		
	}

	@Override
	public void eat() {
		System.out.println("GilaMonster's implementation of eat..........");
		
	}

	

}
