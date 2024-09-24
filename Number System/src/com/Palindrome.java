package com;

import java.util.Scanner;

class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		if (isPalindrome(num)) {
			System.out.println(num+" is a Palindrome Number");
		} 
		else {
			System.out.println(num+" is not a Palindrome Number");
		}
	}

	static boolean isPalindrome(int num) {
		int rev=0,temp = num;
		do {
			rev = rev*10 + temp%10;
			temp /= 10;
		} while (temp!=0);
		return rev == num;
	}
}
