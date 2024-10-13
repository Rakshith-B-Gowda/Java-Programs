package traversingobjects;

import java.util.*;

class StudentMainClass {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(22, "Rakshith"));
		al.add(new Student(22, "Out"));
		
		Iterator<Student> i = al.iterator();
		while (i.hasNext()) {
			Student j = i.next();
			System.out.println("Age: "+j.age+" Name: "+j.name);
		}
	}
}
