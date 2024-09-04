package classtest;

import java.util.Scanner;

class BookMainClass {
	public static void main(String[] args) {
		Books b =new Books();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book name: ");
		b.setName(sc.next());
		System.out.println("Enter Units :");
		b.setUnits(sc.nextInt());
		sc.close();
		System.out.println(b.getName());
		System.out.println(b.getUnits());
		
	}
}
