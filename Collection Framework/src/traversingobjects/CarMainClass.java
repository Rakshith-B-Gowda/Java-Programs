package traversingobjects;

import java.util.*;

class CarMainClass {
	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<Car>();
		al.add(new Car("Lamborgini", 120));
		al.add(new Car("Ferrari", 420));
		
		Iterator<Car> i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
