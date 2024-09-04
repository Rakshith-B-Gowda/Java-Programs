package rtp;

class Customer {
	
	static void selectApp(OnlineShoppingApp obj) {
		obj.order();
	}
	
	public static void main(String[] args) {
		
		//1. Upcasting using methods
		
		System.out.println("1. Upcasting using methods\n");
		selectApp(new Amazon());
		selectApp(new Flipkart());
		selectApp(new Myntra());
		
		System.out.println("-------------------------");
		
		//2. Upcasting using single reference variable
		
		System.out.println("2. Upcasting using single reference variable\n");
		OnlineShoppingApp os1 = new Amazon();
		os1.order();
		
		OnlineShoppingApp os2 = new Flipkart();
		os2.order();
		
		OnlineShoppingApp os3 = new Myntra();
		os3.order();
		
		System.out.println("-------------------------------");
		
		//3. Upcasting using separate reference variable
		
		System.out.println("3. Upcasting using separate reference variable\n");
		OnlineShoppingApp osa;
		osa = new Amazon();
		osa.order();
		
		osa = new Flipkart();
		osa.order();
		
		osa = new Myntra();
		osa.order();
		
	}

}
