package com;

class Vehicle {
	String brand = "Mahindra";
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Driving car!!");
	}
}

class Bike extends Vehicle{
	void ride() {
		System.out.println("Riding bike!!");
	}
}
