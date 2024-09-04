package jspider;

public class Overloading {
	int iD;
	String name;
	float percentage;
	
	Overloading() {
	}
	
	Overloading(int iD) {
		this.iD = iD;
	}
	
	Overloading(int iD, String name, float percentage) {
		this.iD = iD;
		this.name = name;
		this.percentage = percentage;
	}
	
	void data(int iD,String name,float percentage) {
		System.out.println();
		System.out.println("Student ID : "+iD);
		System.out.println("Student Name : "+name);
		System.out.println("Student Percentage : "+percentage);
	}
	
	void data(int iD,String name) {
		System.out.println();
		System.out.println("Student ID : "+iD);
		System.out.println("Student Name : "+name);
	}
	
	void data(String name) {
		System.out.println();
		System.out.println("Student Name : "+name);
	}
	
	public static void main(String[] args) {
		Overloading o1 = new Overloading();
		Overloading o2 = new Overloading(30);
		Overloading o3 = new Overloading(20,"Rakshith",85.5F);
		
		o1.data(o3.iD, o3.name, o3.percentage);
		o2.data(o2.iD, o3.name);
		o3.data(o3.name);
		
		
	}

}
