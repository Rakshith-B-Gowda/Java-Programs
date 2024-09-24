package org;

import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Infinite Loop
		while(true) {
			System.out.println("Enter choice:");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Hai");
				break;

			case 2:
				System.out.println("Bye");
				break;
			
			case 3:
				System.out.println("Thank You!!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid");
				break;
			} //End of switch
			
			System.out.println("-----------");
			
		} // End of while
		
	} // End of main
	
} // End of Class







