package com;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(max(scan.nextInt()));
		scan.close();
	}
	
	public static int max(int n) {
		int max = n%10;
		n= n/10;
		do {
			int d = n%10;
			if (d<max) {
				max = d;
			}
			n /=10;
			
		} while (n!=0);
		return max;
	}

}
