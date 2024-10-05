package defalultsorting;

import java.util.TreeSet;

class PersonMainClass {
	public static void main(String[] args) {
		Person p1 = new Person(25, "zakshith");
		Person p2 = new Person(22, "Yatish");
		Person p3 = new Person(23, "Prajwal");
		
		TreeSet<Person> t = new TreeSet<Person>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		
		for (Person p : t) {
			System.out.println(p);
		}			
	}
}
