package org;

class Tom extends Employee{

	@Override
	void work() {
		System.out.println("Tom is Working!!");
	}

	@Override
	void eat() {
		System.out.println("Tom is eating!!");
	}

	@Override
	void walk() {
		System.out.println("Tom is walking!!");
	}
	
	public static void main(String[] args) {
		Tom t = new Tom();
		t.eat();
		t.walk();
		t.work();
	}
}
