package com;

import java.util.Scanner;

class SolidRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m and n value of rectangle");
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
