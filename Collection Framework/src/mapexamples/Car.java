package mapexamples;

class Car {
	String brand;

	Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return  "Brand: "+brand;
	}
}
