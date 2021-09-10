package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.student.Student;
import com.fruit.Fruit;
import com.fruit.FruitComparatorNameAsc;
import com.fruit.FruitComparatorNameDesc;
import com.fruit.FruitComparatorPriceAsc;
import com.fruit.FruitComparatorPriceDesc;

public class Main {

	public static void main(String[] args) {
		List<Student> sl = new ArrayList<Student>();
		
		sl.add(new Student(101, "Kim", 10));
		sl.add(new Student(102, "Lee", 20));
		sl.add(new Student(103, "Park", 30));
		sl.add(new Student(104, "Choi", 40));
		sl.add(new Student(105, "Jung", 50));
		sl.add(new Student(106, "Kang", 55));
		sl.add(new Student(107, "Jo", 45));
		sl.add(new Student(108, "Yoon", 35));
		sl.add(new Student(109, "Jang", 25));
		sl.add(new Student(110, "Yim", 15));
		
		Collections.sort(sl);
		
		System.out.println("\nStudent List (ordered by name)");
		for (Student s : sl) System.out.println(s.toString());
		
		Collections.sort(sl, Collections.reverseOrder());
		
		System.out.println("\nStudent List (reverse ordered by name)");
		for (Student s : sl) System.out.println(s.toString());
		
		
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
