package example;

import java.util.Vector;

class VectorMainClass {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(25);
		v.add(65);
		v.add(75);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("---------");
		
		for (Integer vec : v) {
			System.out.println(vec);
		}
	}
}
