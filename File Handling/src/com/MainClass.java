package com;

import java.io.File;
import java.util.Date;

class MainClass {
	public static void main(String[] args) {
		
		// 1. Creating file object & specifying file name
		File f = new File("demo.txt");
		// 2. lastModified() returns milliSeconds value
		long milliSeconds = f.lastModified();
		// 3. Converting milliSeconds into Date Format
		Date d = new Date(milliSeconds);
		// 4. Printing reference variable because toString() is overridden in Date class
		System.out.println(d);
		
		System.out.println("-----");
		
		// Reducing the code 
		
		File f2 = new File("demo.txt");
		Date d2 = new Date(f2.lastModified());
		System.out.println(d2);
		
		System.out.println("-------");
		
		Date d3 = new Date(new File("demo.txt").lastModified());
		System.out.println(d3);
		
		System.out.println("--------");
		
		System.out.println(new Date(new File("demo.txt").lastModified()));
	}
}
