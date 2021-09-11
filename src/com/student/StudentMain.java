package com.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.student.dao.Student;

public class StudentMain {

	public static void start() {
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
	}
}
