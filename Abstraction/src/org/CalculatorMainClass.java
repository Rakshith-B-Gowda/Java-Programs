package org;

import java.util.Scanner;

class CalculatorMainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator Project");
		System.out.println("-----------------------------");

		Scanner sc = new Scanner(System.in); // To accept input from the users

		Calculator cal = new CalculatorImpl(); // Upcasting to achieve abstraction


		while(true) { // infinite loop

			// Menu Driven Program
			System.out.println("Enter the choice \n1. Addition \n2. Subraction \n3. Multipication \n4. Division \n5. EXIT");
			int choice = sc.nextInt();

			/**
			 *  - a & b are local variable, and local variable do not have default values.
			 *  - Therefore initializing it to 0 before using.
			 */
			int a=0;
			int b=0;

			// Accepting 2 numbers only when choice is 1 2 3 4
			if(choice >= 1 && choice <= 4) {
				System.out.println("Enter 2 numbers: ");
				a = sc.nextInt(); 
				b=sc.nextInt();
			}

			switch (choice) {
			case 1:
				cal.add(a, b);
				break;

			case 2:
				cal.sub(a, b);
				break;

			case 3:
				cal.mul(a, b);
				break;

			case 4:
				cal.div(a, b);
				break;

			case 5:
				System.out.println("EXITED!!!!");
				System.exit(0); // Terminate the Program
				break;

			default:
				System.out.println("INVALID CHOICE");
			} // end of switch
			
			System.out.println("------------------------------------------------");
			
		} // end of while
		
	} // end of main
	
} // end of class
