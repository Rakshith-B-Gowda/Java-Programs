package org;

import java.util.ArrayList;
import java.util.LinkedList;

class GenericsExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(12);
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		System.out.println("---------");
		
		LinkedList<Double> ll = new LinkedList<Double>();
		ll.add(20.0);
		ll.add(22.3);
		ll.add(55.2);
		for (Double double1 : ll) {
			System.out.println(double1);
		}
	}
}
