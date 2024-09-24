package org;

class Demp {
	
	public static void main(String[] args) {
		String s1 = new String("Hello");
		System.out.println(s1); // Hello
		s1.concat(" World!");
		System.out.println(s1); // Hello -> because String is immutable
		s1 = s1.concat(" World!!!");
		System.out.println(s1); // Hello World -> because we are re-initializing the s1 to the concatenated string.
		System.out.println("--------");
		
		StringBuffer s2 = new StringBuffer("Hello");
		System.out.println(s2); // Hello
		s2.append(" World");
		System.out.println(s2); // Hello World -> because StringBuffer is mutable
		System.out.println("------");
		
		StringBuilder s3 = new StringBuilder("Good");
		System.out.println(s3); // Good
		s3.append(" Morning");
		System.out.println(s3); // Good Morning -> because StringBuilder is mutable
		System.out.println("------");
		
		String s4 = new String("Wake");
		System.out.println(s4); // Wake
		s4.concat(" Up!!");
		System.out.println(s4); // Wake
		s4 = s4.concat(" Up!!!");
		System.out.println(s4); // Wake Up!! -> because we are re-initializing the s4 to the concatenated string.
	}
}
