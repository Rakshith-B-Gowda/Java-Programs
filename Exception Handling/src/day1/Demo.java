package day1;

import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		System.out.println("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		System.out.println(a/b);

		System.out.println("END");

	}
}