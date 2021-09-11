package com.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fruit.dao.Fruit;
import com.fruit.service.FruitComparatorNameAsc;
import com.fruit.service.FruitComparatorNameDesc;
import com.fruit.service.FruitComparatorPriceAsc;
import com.fruit.service.FruitComparatorPriceDesc;

public class FruitMain {

	public static void start() {
		List<Fruit> fl = new ArrayList<Fruit>();
		
		fl.add(new Fruit(101, "Apple", 1000));
		fl.add(new Fruit(102, "Banana", 2000));
		fl.add(new Fruit(103, "Orange", 3000));
		fl.add(new Fruit(104, "Kiwi", 4000));
		fl.add(new Fruit(105, "Pineapple", 5000));
		fl.add(new Fruit(106, "Grapes", 5500));
		fl.add(new Fruit(107, "Watermelon", 4500));
		fl.add(new Fruit(108, "Melon", 3500));
		fl.add(new Fruit(109, "Peach", 2500));
		fl.add(new Fruit(110, "Lemon", 1500));
		
		Collections.sort(fl, new FruitComparatorNameAsc());
		
		System.out.println("\nFruit List (ordered by name)");
		for (Fruit f : fl) System.out.println(f.toString());

		Collections.sort(fl, new FruitComparatorNameDesc());
		
		System.out.println("\nFruit List (reverse ordered by name)");
		for (Fruit f : fl) System.out.println(f.toString());
		
		Collections.sort(fl, new FruitComparatorPriceAsc());
		
		System.out.println("\nFruit List (ordered by price)");
		for (Fruit f : fl) System.out.println(f.toString());
		
		Collections.sort(fl, new FruitComparatorPriceDesc());
		
		System.out.println("\nFruit List (reverse ordered by price)");
		for (Fruit f : fl) System.out.println(f.toString());
		
	}

}
