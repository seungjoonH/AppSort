package com.fruit.service;

import java.util.Comparator;

import com.fruit.dao.Fruit;

public class FruitComparatorNameDesc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}
