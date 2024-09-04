package javabean;

import java.util.Scanner;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		e.setId(sc.nextInt());
		
		System.out.println("Enter Name: ");
		e.setName(sc.next());
		
		System.out.println("Enter Salary: ");
		e.setSalary(sc.nextDouble());
		
		sc.close();
		
		System.out.println("\nId: "+e.getId()+"\nName: "+e.getName()+"\nSalary: "+e.getSalary()+"LPA");
		
		
	}

}
