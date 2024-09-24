package day1;

class Test {
	public static void main(String[] args) {
		System.out.println("Start");
		int[] ar = { 10, 20, 30 };
		
		try {
			System.out.println(ar[3]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught: "+e);
		}
		
		System.out.println("END");
	}
}
