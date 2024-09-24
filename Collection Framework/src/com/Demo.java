package com;

import java.util.ArrayList;
import java.util.List;

class Demo {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(1.2);
		l.add("java");
		l.add(10);
		l.add(null);
		
		System.out.println(l); // [10, 1.2, java, 10, null]
		System.out.println(l.get(1)); // 1.2
		System.out.println(l.size()); // 5
		System.out.println(l.contains("Java")); // false
		System.out.println(l.contains("java")); // true
		System.out.println("----------");
		
		System.out.println(l); // [10, 1.2, java, 10, null]
		l.remove(1);
		System.out.println(l); // [10, java, 10, null]
		System.out.println("---------");
		
		System.out.println(l.isEmpty()); // false
		l.clear();
		System.out.println(l); //[]
		System.out.println(l.isEmpty()); // true
		}
}
