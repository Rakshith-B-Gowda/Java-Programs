package com;
class Runner {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		
		for(int i = a.length-1 ; i>=0 ; i-- ) {
			System.out.println(a[i]);
		}
		System.out.println("----------");
		
		String[] fruit = {"Apple", "Banana", "Orange", "Mango"}; 
		
		for(int i=fruit.length-1;i>=0;i--) {
			System.out.println(fruit[i]);
		}
		
	}
}
