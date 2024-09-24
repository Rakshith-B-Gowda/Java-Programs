package com;

import java.util.Scanner;

class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		sc.close();
		String reverse = "";
		int len = s.length() - 1;
		
		for(int i = len ; i >= 0 ; i-- ) {
			reverse = reverse + s.charAt(len);
			len--;
		}
		
		System.out.println("Reverse of "+s+" is : "+reverse);
	}
}
