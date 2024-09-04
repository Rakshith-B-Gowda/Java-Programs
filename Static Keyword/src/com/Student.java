package com;

//Accessing static members inside same class 
class Student {
	//static variable
	static String name = "John";

	//static method
	static void study() {
		System.out.println("Studying!");
	}

	public static void main(String[] args) { //class loader
		
		System.out.println("Name : "+Student.name);
		Student.study();
		System.out.println("----------------");
		System.out.println("Name : "+name);//ClassName.name -> Student.name
		study(); //ClassName.method() -> Student.study()
	}

}
