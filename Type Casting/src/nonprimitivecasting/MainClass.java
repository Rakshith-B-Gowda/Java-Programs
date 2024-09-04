package nonprimitivecasting;

class MainClass {
	public static void main(String[] args) {
		Vehicle v = new Car();
		
		//Up-Casting
		System.out.println("Brand: "+v.brand);
		v.start();
		
		System.out.println("---------");
		
		//Down-Casting
		Car c = (Car) v;
		System.out.println("Brand: "+c.brand+"\nFuel: "+c.fuel);
		c.start();
		c.drive();
		
	}
}
