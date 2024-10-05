package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rakshith");
		al.add("Prajwal");
		al.add("Rahul");
		al.add("Srikanth");
		al.add("Out");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sort In Ascending Order\n2. Sort in Descending Order");
		System.out.println("-> Enter the choice: ");
		int choice = sc.nextInt();
		sc.close();
		switch (choice) {
		case 1:
			Collections.sort(al);
			System.out.println("-> Ascending Order of Names: ");
			for (String name : al) 
				System.out.println( name);	
			break;
		case 2:
			Collections.sort(al);
			Collections.reverse(al);
			System.out.println("-> Descending Order of Names: ");
			for (String name : al) 
				System.out.println(name);
			break;
		default:
			System.out.println("Invalid Choice!!");
			break;
		}
	}
}
