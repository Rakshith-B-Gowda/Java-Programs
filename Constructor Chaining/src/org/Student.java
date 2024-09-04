package org;

class Student {
	int age;
	String name;
	
	Student(int age) {
		this.age = age;
	}
	
	Student(int age, String name) {
		this(age);
		this.name = name;
	}
	
	public static void main(String[] arg) {
		Student s = new Student(21, "Rakshith");
		System.out.println("Age: "+s.age);
		System.out.println("Name: "+s.name);
	}
}
