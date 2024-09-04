package jspider;

class Car {
	String name;
	double milage;
	int topSpeed;
	
	Car(String name, double milage, int topSpeed) {
		this.name = name;
		this.milage = milage;
		this.topSpeed = topSpeed;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("Hyundai", 15.5, 170);
		System.out.println("Brand: "+c1.name+" Milage: "+c1.milage+" Top Speed : "+c1.topSpeed);
	}
	
}
