package com;

class Customer extends Amazon{

	@Override
	void buy(String item) {
		System.out.println("Buying "+item);
	}

	@Override
	void pay(double cost) {
		System.out.println("Paying ₹"+cost);
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.buy("Laptop");
		c.pay(85000.55);

	}


}
