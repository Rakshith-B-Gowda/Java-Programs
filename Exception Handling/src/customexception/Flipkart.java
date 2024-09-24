package customexception;

import java.util.Scanner;

class Flipkart {

	static void login(int otp) throws InvalidOTPException {
		if (otp == 1234) {
			System.out.println("Login Succesful!");
		} else {
			throw new InvalidOTPException("Wrong OTP!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the OPT:");
		int opt = sc.nextInt();
		try {
			login(opt);
		} 
		catch (InvalidOTPException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
