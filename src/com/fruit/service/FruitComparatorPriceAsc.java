package com.fruit.service;

import java.util.Comparator;

import com.fruit.dao.Fruit;

public class FruitComparatorPriceAsc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
	}
	
}
