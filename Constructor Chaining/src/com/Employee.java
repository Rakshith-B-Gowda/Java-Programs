package com;

class Employee {
	 Employee(String name, int age) {
		 this(2.8);
		 System.out.println("Name: "+name+" Age: "+age);		 
	 }
	 
	 Employee(int id){
		 System.out.println("Id: "+id);
	 }
	 
	 Employee(double sal){
		 this(100);
		 System.out.println("Salary: "+sal);
	 }
	 
	 public static void main(String[] args) {
		Employee e = new Employee("Tom",22);
	}

}
