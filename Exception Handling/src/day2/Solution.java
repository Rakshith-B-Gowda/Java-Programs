package day2;

class Solution {
	public static void main(String[] args) {
		try {
			try {
				System.out.println(10/2);
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("Invalid Denominator");	
			}
			int[] a = {1,2,};
			System.out.println(a[3]);
			System.out.println("end");
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Invalid Index");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Invalid Denominator");		
		}
		catch (Exception e) 
		{
			System.out.println("Super Class Handled");
		}
	}
}
