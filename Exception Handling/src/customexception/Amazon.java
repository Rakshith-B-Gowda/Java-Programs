package customexception;

import java.util.Scanner;

class Amazon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		int marks = sc.nextInt();
		sc.close();
		
		if (marks >= 70) {
			System.out.println("Apply for Interview");
		}
		else {
			try {
				throw new InvalidMarksException("Rejected!!!\nBetter Luck Next Time!");
			} 
			catch (InvalidMarksException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
