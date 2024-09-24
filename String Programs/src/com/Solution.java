package com;

class Solution {
	
	public static void main(String[] args) {
		String s = new String("a");
		System.out.println(s); //toString()
		System.out.println(s.toString());
		System.out.println("----------");
		
		System.out.println(s.hashCode()); // hashCode() returns ASCII value of the string characters
		System.out.println("-------");
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2); // compares addresses or references
		System.out.println(s1.equals(s2)); // compare data or content
		
	}
}
