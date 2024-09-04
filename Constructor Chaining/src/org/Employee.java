package org;

class Employee {
	int id;
	String name;
	double salary;
	
	Employee(int id) {
		this.id = id;
	}
	
	Employee(int id, String name) {
		this(id);
		this.name = name;
		
	}
	
	Employee(int id, String name, double salary) {
		this(id,name);
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(101, "Rakshith", 7.5);
		System.out.println("Id: "+e.id);
		System.out.println("Name: "+e.name);
		System.out.println("Salary: "+e.salary+"LPA");
	}
	
}
