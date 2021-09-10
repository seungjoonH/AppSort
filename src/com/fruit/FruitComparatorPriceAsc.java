package com.fruit;

import java.util.Comparator;

public class FruitComparatorPriceAsc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return Integer.valueOf(o1.price).compareTo(o2.price);
	}
	
}
