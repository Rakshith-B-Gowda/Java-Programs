package customexception;

import java.util.Scanner;

class Election {
	
	static void checkEligibility(int age) throws AgeInvalidException{
		if (age > 18) {
			System.out.println("Eligible to Vote");
		} 
		else {
				throw new AgeInvalidException("Not Eligible to Vote!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		try {
			checkEligibility(age);
		} 
		catch (AgeInvalidException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
