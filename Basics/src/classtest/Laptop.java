package classtest;

public class Laptop {
	String brand, modelNo;
	double cost;
	
	Laptop(String brand) {
		this.brand = brand;
	}	
	
	Laptop(String brand,String modelNo){
		this(brand);
		this.modelNo = modelNo;
	}
	Laptop(String brand,String modelNo,double cost) {
		this(brand, modelNo);
		this.cost = cost;
	}
	
	public static void main(String[] args) {
		Laptop l = new Laptop("Apple", "M2Pro", 135000);
		System.out.println("Brand: "+l.brand+"\nModel No: "+l.modelNo+"\nCost: ₹"+l.cost);
	}
}
