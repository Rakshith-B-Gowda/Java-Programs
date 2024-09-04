package org;

class Car {
	String brand;
	int cost;
	
	Car(String brand) {
		this.brand = brand;
	}
	
	Car(String brand, int cost) {
		this(brand);
		this.cost = cost;
	}
	
	public static void main(String[] args) {
		Car c = new Car("Suzuki",5000);
		System.out.println("Brand: "+c.brand);
		System.out.println("Cost: "+c.cost);	
	}
}