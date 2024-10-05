package sortobjects;

import java.util.ArrayList;
import java.util.Collections;

class PenMainClass {
	public static void main(String[] args) {
		Pen p1 = new Pen(200);
		Pen p2 = new Pen(150);
		Pen p3 = new Pen(100);
		Pen p4 = new Pen(100);
		
		ArrayList<Pen> al = new ArrayList<Pen>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		// syntax: Collections.sort(List l);
		// Since list has Car objects, sort() calls compareTo() of Car class
		// Collection.reverse(al); for descending order
		Collections.sort(al);
		Collections.reverse(al);
		
		for (Pen pen : al) {
			System.out.println(pen);
		}
		
		
		
	}
}
