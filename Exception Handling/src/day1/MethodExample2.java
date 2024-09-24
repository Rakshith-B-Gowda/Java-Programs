package day1;

class MethodExample2 {
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			System.out.println(10/0);
			
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("END");
	}
}
