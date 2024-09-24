package customexception;

import java.util.Scanner;

class GmailLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Password");
		int password = sc.nextInt();
		sc.close();
		
		if (password == 123) {
			System.out.println("Login Successful");
		}
		else {
			try {
				throw new InvalidPasswordException("Invalid Password");
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
