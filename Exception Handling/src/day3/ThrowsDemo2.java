package day3;


class ThrowsDemo2 {
	
	public static void display() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {
		try {
			display();
		} 
		catch (Exception e) {
			System.out.println("handled");
		}
	}

}
