package org;

import com.Vehicle;   //Accessing protected members in different package

class Car extends Vehicle{
	public static void main(String[] args) {
		Car c = new Car();
		
		System.out.println("Brand: "+c.brand);
		System.out.println("Color: "+c.color);
	}

}
