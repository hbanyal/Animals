package com.hitendra;

public class GoldFish extends Fish implements SwimmingBehavior{

	@Override
	public void swim() {
		System.out.println("GoldFish's implementation of swim..........");
		
	}

	@Override
	public void speak() {
		System.out.println("GoldFish's implementation of speak..........");
		
	}

	@Override
	public void eat() {
		System.out.println("GoldFish's implementation of eat..........");
		
	}

	

}
