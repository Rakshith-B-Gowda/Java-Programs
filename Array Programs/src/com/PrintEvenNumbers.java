package com;

class PrintEvenNumbers {
	public static void main(String[] args) {
		int[] a = {10, 11, 12, 13, 14, 15};
		
		for(int i = 0; i<a.length; i++) {
			
			if (a[i]%2==0) 
				System.out.println(a[i]);
	
		}
	}
}
