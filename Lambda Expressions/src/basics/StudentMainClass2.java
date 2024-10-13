package basics;

import java.util.*;

class StudentMainClass2 {
	public static void main(String[] args) {

		// Based on Name using Lambda Expression
		Comparator<Student> nameCom = (s1, s2) -> s1.getName().compareTo(s2.getName()) >= 0                     ? 1 : -1;


		TreeSet<Student> ts = new TreeSet<Student>(nameCom);
		ts.add(new Student("Rakshith", 101, 85.5));
		ts.add(new Student("Rahul", 100, 80.5));
		ts.add(new Student("Out", 105, 99.9));
		ts.add(new Student("Prajwal", 99, 75.5));
		ts.add(new Student("Srikanth", 108, 35.0));

		for (Student s : ts) {
			System.out.println(s);
		}
	}
}
