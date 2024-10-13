package basics;

import java.util.*;

class StudentMainClass1 {
	public static void main(String[] args) {
		
		// Based on ID using Anonymous Class Technique : 
		Comparator<Student> idCom = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getId().compareTo(s2.getId());
			}
		};
		
		TreeSet<Student> ts = new TreeSet<Student>(idCom);
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
