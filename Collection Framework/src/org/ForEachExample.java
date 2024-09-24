package org;

class ForEachExample {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("----");
		
		double[] marks = {12.3, 45.6, 98.7};
		for(double x : marks) {
			System.out.println(x);
		}
		System.out.println("---");
		
		String[] subjects = {"Java", "Python", "JavaScript"};
		for(String s : subjects) {
			System.out.println(s);
		}
		
	}

}
