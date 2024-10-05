package mapexamples;

import java.util.HashSet;
import java.util.LinkedHashMap;

class MainClass {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "Apple");
		map.put(20, "Sony");
		map.put(30, "Samsung");
		
		// Traversing it using for each loop
		// Set<Integer> keys = map.keySet(); -> {10, 20, 30}
		HashSet<Integer> s = new HashSet<Integer>(map.keySet());
		
		for (Integer integer : s) {
			System.out.println(map.get(integer));
		}
		System.out.println("-----");
		
		for (Integer integer : map.keySet()) {
			System.out.println("{"+integer+"="+map.get(integer)+"}");
		}
	}
}


















