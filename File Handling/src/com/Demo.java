package com;

import java.io.File;

class Demo {
	public static void main(String[] args) {
		
		// Object representation of a file or folder name
		// Since path is not specified, folder gets created inside the project
		// File f = new File("car");
		
		// Folder gets created within d drive
		File f = new File("student");
		
		boolean result = f.mkdir(); // after creating a folder, it returns true or false
		
		System.out.println(result); // System.out.println(f.mkdir());
	}
}

// directory -> folder -> package