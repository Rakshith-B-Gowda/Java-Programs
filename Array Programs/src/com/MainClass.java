package com;

public class MainClass {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);

		}

		System.out.println("---------");

		String[] fruit = {"Apple", "Banana", "Orange", "Mango"};
		for(int i=0; i<fruit.length; i++) {
			System.out.println(fruit[i]);

		}

		//i < 3 -> Bad Practice (Hard Coding)
		//i < a.length -> Good Practice
	}
}
