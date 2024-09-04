package com;

class B{
	static int a = 10;
	int b= 20;
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println("Static a = "+b.a);
		System.out.println("b = "+b.b);
	}

}
