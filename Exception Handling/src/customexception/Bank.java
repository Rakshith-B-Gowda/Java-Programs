package customexception;

import java.util.Scanner;

class Bank {

	public static void main(String[] args) {
		int balance = 5000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn:");
		int amount = sc.nextInt();
		sc.close();
		
		if (amount <= balance) {
			System.out.println("Amount Withdrawn Successfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("dud illa");
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
				//System.out.println("Caught: "+e);
				e.printStackTrace();
			}
		}
	}
}
