package com;

//Accessing public members in different class, same package
class EmployeeMainClass {
	public static void main(String[] args) {
		System.out.println("Id: "+Employee.id);
		
		Employee e = new Employee();
		e.work();
	}
}
