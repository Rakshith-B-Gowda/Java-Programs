package com;
	
class Car {
	
	@Override
	public String toString()
	{
		return "Car@12345";
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c);//c.toString()	
	}
}
