package com;

class Student {
	
	int age;

	Student(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student age is "+age;
	}
	
	public static void main(String[] args) {
		Student s = new Student(21);
		System.out.println(s);
	}
}
