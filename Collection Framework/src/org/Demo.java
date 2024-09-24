package org;

import java.util.LinkedList;

class Demo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add("String");
		
		System.out.println(l);
		System.out.println("------");
		
		// Forward Traversing
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));;
		}
		System.out.println("--------");
		
		// Backward Traversing
		for (int i = l.size()-1; i >= 0; i--) {
			System.out.println(l.get(i));;
		}	
	}
}
