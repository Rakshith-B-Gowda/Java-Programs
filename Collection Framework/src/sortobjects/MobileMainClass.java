package sortobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MobileMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Mobile m1 = new Mobile("Apple", 85000);
		Mobile m2 = new Mobile("Samsung", 78200);
		Mobile m3 = new Mobile("OnePlus", 8500);

		ArrayList<Mobile> l = new ArrayList<Mobile>();
		l.add(m1);
		l.add(m2);
		l.add(m3);

		do {
			System.out.println("Select\n1.Sort Based on Brand\n2.Sort Based on Cost\n3.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Collections.sort(l, new MobileBrandComparator());
				System.out.println("Based on Brand: ");

				for (Mobile mobile : l) {
					System.out.println(mobile);
				}
				System.out.println("------------");
				break;

			case 2:
				Collections.sort(l, new MobileCostComparator());
				System.out.println("\nBased on Cost: ");

				for (Mobile mobile : l) {
					System.out.println(mobile);
				}
				System.out.println("--------------");
				break;

			case 3:
				System.exit(0);
			default:
				break;
			}
		} while (true);	
	}
}
