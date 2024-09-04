package com;

//Accessing public members in same class
public class Student {

	public int age = 10;

	public static void study() {	
		System.out.println("Studying Java!!");
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Age: "+s.age);

		study();//Student.study();
	}

}
