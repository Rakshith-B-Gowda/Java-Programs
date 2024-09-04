package com;

class Tom implements Person{

	@Override
	public void eat() {
		System.out.println("Eating Biryani!!");
	}
	
	public static void main(String[] args) {
		Tom t = new Tom();
		System.out.println("Age: "+Person.age);
		t.eat();
	}
	

}
