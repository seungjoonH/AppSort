package com.fruit;

import java.util.Comparator;

public class FruitComparatorNameDesc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
	
}
