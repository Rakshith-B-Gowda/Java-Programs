package com;

import java.util.Scanner;

class CountEnOdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		countDigit(num);
	}

	static void countDigit(int num) {
		int ec=0,oc=0,temp=num;
		do {
			int d = temp %10;
			if (d%2 == 0) {
				ec++;
			} else {
				oc++;
			}
			temp/=10;
		} while (temp!=0);
		System.out.println("Even digit count in "+num+" is "+ec);
		System.out.println("Odd digit count in "+num+" is "+oc);
	}
}
