package com.fruit.service;

import java.util.Comparator;

import com.fruit.dao.Fruit;

public class FruitComparatorPriceDesc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return Integer.valueOf(o2.getPrice()).compareTo(o1.getPrice());
	}
	
}
