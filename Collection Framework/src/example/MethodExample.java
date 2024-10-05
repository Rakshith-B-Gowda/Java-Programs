package example;
import java.util.*;

class MethodExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		
		LinkedList ll = new LinkedList();
		ll.addAll(al);
		ll.add(30);
		
		System.out.println(al); // [10, 20]
		System.out.println(ll); // [10, 20, 30]
		System.out.println("-----");
		
		System.out.println(ll.containsAll(al)); // true
		System.out.println("---------");
		
		System.out.println(ll); // [10, 20, 30]
		ll.removeAll(al);
		System.out.println(ll); // [30]
		
		System.out.println("***************");
		
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		x.add(30);
		
		LinkedList y = new LinkedList();
		y.add(x);
		y.add(30);
		
		System.out.println("ELEMENT: "+y+" SIZE: "+y.size());
	}
}

/**
 * x -> ArrayList and y -> LiskedList 
 * 
 * 1. If we use y.addAll(x); -> We are adding all the objects of 1 Collection into 
 *    another Collection 1 by 1 (sequentially).
 *    
 *    Therefore Elements -> [10, 20, 30] and Size -> 3
 *    
 * 2. If we use y.add(x); -> We are adding all the objects of 1 Collection into 
 *    another Collection as a single object.
 * 	  
 *    Therefore Elements -> [[10, 20], 30] and Size -> 2
 *    
 */














