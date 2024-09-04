package javabean;
import java.util.Scanner;

class MobileMainClass {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter brand: ");
		m.setBrand(sc.nextLine());
			
		System.out.println("Enter cost: ");
		m.setCost(sc.nextDouble());
		
		sc.close(); // optional, but good practice
		
		String brand=m.getBrand();
		double cost=m.getCost();
		
		System.out.println("Brand: "+brand);
		System.out.println("Cost: "+cost);
		
	}

}
