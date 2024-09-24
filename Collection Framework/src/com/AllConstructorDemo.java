package com;

import java.util.ArrayList;

class AllConstructorDemo {
	public static void main(String[] args) {
		
		// Internally an ArrayList gets created of default initial capacity (10)
		ArrayList a = new ArrayList();
		
		// Internally an array gets created of custom initial capacity (20)
		ArrayList b = new ArrayList();
		
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
		// Adding one Collection into another Collection
		ArrayList y = new ArrayList(x);
		y.add(30);
		
		System.out.println(x); // [10,20]
		System.out.println(y); // [10,20, 30]
		
		
	}
}
