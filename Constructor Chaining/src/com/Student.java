package com;

class Student {
	Student(int age) {
		this("Rakshith");
		System.out.println("Age: "+age);
	}

	Student(String name) {
		this(6.2);
		System.out.println("Name: "+name);
	}

	Student(double height) {
		System.out.println("Height: "+height);
}

	public static void main(String[] args) {
		Student s = new Student(22);
	}
}
