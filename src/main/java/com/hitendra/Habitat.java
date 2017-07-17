package com.hitendra;

import java.util.Map;

public interface Habitat<T extends Animal> {

	void put(String name, T animal);

	Map<String, T> getAnimals();

}
