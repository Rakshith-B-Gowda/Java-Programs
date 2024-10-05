package defalultsorting;

import java.util.TreeSet;

class StudentMainClass {

	public static void main(String[] args) {
		Student s1 = new Student(21);
		Student s2 = new Student(25);
		Student s3 = new Student(18);
		
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for (Student std : ts) {
			System.out.println(std);
		}
	}
}
