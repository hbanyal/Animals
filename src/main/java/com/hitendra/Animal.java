package com.hitendra;

public abstract class Animal {
	private boolean isAlive = true;
	protected String name;

	public abstract void speak();

	public abstract void eat();

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
