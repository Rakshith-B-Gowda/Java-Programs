package basics;

import java.util.*;

class StudentMainClass3 {
	public static void main(String[] args) {
		
		// Based on percentage inside the constructor : 
		
	TreeSet<Student> ts = new TreeSet<Student>((s1, s2) -> s1.getPer().compareTo(s2.getPer()) >= 0 ? 1 : -1);
		
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
