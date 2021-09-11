package com.fruit.service;

import java.util.Comparator;

import com.fruit.dao.Fruit;

public class FruitComparatorNameAsc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
