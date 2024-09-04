package com;

class Solution {

	static void display(Vehicle obj) {
		if (obj instanceof Car) {
			System.out.println("Downcasting to Car");
			Car c = (Car) obj;
			System.out.println("Brand: "+c.brand);
			c.drive();
		}
		else if (obj instanceof Bike) {
			System.out.println("Downcasting to Bike");
			Bike b = (Bike) obj;
			System.out.println("Brand: "+b.brand);
			b.ride();
		}
		
	}
	public static void main(String[] args) {
		display(new Car());
		System.out.println("-------");
		display(new Bike());
		
	}
}
