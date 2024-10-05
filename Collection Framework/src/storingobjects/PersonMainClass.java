package storingobjects;

import java.util.ArrayList;

class PersonMainClass {

	public static void main(String[] args) {
		Person p1 = new Person(21, "Rakshtih");
		Person p2 = new Person(22, "Rahul");
		Person p3 = new Person(23, "Agarwal");

		ArrayList<Person> al = new ArrayList<Person>();
		al.add(p1);
		al.add(p2);
		al.add(p3);

		for (Person p : al) {
			if (p.name.startsWith("A") || p.name.startsWith("a")) {
				System.out.println(p);
			}
		}
	}
}


