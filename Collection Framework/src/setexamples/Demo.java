package setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;

class Demo {
	public static void main(String[] args) {
		
		// Insertion Order is not maintained
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(1.2);
		hs.add("java");
		hs.add(10);
		hs.add(null);
		
		System.out.println("Size: "+hs.size()); // Size: 4
		for (Object obj : hs) {
			System.out.println(obj);
		}
		
		System.out.println("--------------");
		
		//Insertion Order is maintained
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(30);
		lhs.add(20);
		lhs.add(10);
		lhs.add(10);
		
		System.out.println("Size: "+lhs.size());
		for (Integer i : lhs) {
			System.out.println(i);
		}
		
	}
}


















