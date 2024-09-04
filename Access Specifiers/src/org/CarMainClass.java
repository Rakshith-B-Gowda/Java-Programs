package org;

import com.Car;

//Accessing public members in different package
public class CarMainClass {
	public static void main(String[] args) {
		
		System.out.println("Brand: "+Car.brand);
		
		Car c = new Car();
		System.out.println("Cost: "+c.cost);
	}

}
