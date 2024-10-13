package mapexamples;

import java.util.LinkedHashMap;
import java.util.Set;

class CarMainClass {
	public static void main(String[] args) {
		Car c1 = new Car("Audi");
		Car c2 = new Car("BMW");
		Car c3 = new Car("Suzuki");
		
		LinkedHashMap<Car, Integer> map = new LinkedHashMap<Car, Integer>();
		map.put(c1, 50000);
		map.put(c2, 13500);
		map.put(c3, 28000);
		
		Set<Car> cars = map.keySet(); // c1, c2, c3
		for (Car car : cars) {
			System.out.println(car+", Cost: "+map.get(car));
		}
		
	}
}
