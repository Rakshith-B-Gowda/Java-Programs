package org;

import java.util.ArrayList;

class Test {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(27);
		l.add(39);
		
		System.out.println(l); // [12, 27, 39]
		l.add(1, 55);
		System.out.println(l); // [12, 55, 27, 39]
		l.set(2, 77);
		System.out.println(l); // [12, 55, 77, 39]
	}
}
