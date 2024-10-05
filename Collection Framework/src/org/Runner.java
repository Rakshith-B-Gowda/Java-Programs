package org;

import java.util.ArrayList;
      import java.util.Collections;
import java.util.LinkedList;

class Runner {	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(10);
		System.out.println(al); // [20, 30, 10]
		Collections.sort(al);
		System.out.println(al); // [10, 20, 30]
		Collections.reverse(al);
		System.out.println(al); // [30, 20, 10]
		
		System.out.println("------");
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(true);
		ll.add(10.3);
		System.out.println(ll); // [10, true, 10.3]
		 // Collections.sort(ll); -> ClassCastException
		Collections.reverse(ll);
		System.out.println(ll); // [10.3, true, 10]
	}
}
