package com.fruit;

import java.util.Comparator;

public class FruitComparatorPriceDesc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return Integer.valueOf(o2.price).compareTo(o1.price);
	}
	
}
