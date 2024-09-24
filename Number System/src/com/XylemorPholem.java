package com;

import java.util.Scanner;

class XylemorPholem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Entered number is "+isXorP(num));
	}

	static String isXorP(int num) {
		int es=0,ms=0,t=num;
		do {
			int d = num%10;
			if (num==t || num==d) {
				es = es+d;
			} else {
				ms +=d;
			}
			num = num/10;
		} while (num!=0);
		if (es==ms) {
			return "Xylem";
		} else {
			return "Pholem";
		}
	}
}
