package comparingobjects;

class Car {
	double cost;

	Car(double cost) {
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car c = (Car) obj;
			return this.cost == c.cost;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car(25000);
		Car c2 = new Car(25000);
		Car c3 = new Car(25000.01);
		
		System.out.println(c1.equals(c2)); // true
		System.out.println(c1.equals(c3)); // false
		System.out.println(c2.equals(new Student(20))); // false
		System.out.println(new Car(20000).equals(new Car(20000))); // true 
		
		if (c1.equals(c2)) {
			System.out.println("Cost is same");
		}
		else {
			System.out.println("Cost is different");
		}
	}
}
