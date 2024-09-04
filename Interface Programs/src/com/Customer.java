package com;

class Customer implements Uber{

	@Override
	public void bookCab() {
		System.out.println("Booked a Cab through Uber");
	}

	@Override
	public void payAmount() {
		System.out.println("Payed amount through GooglePay");
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.bookCab();
		c.payAmount();
	}
	

}
