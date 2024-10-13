package com;

import java.io.File;

class Runner {
	public static void main(String[] args) {
		File f = new File("d:/Car.pdf");
		
		if (f.exists()) {
			System.out.println("File/Folder Deleted");
			f.delete();
		} else {
			System.out.println("File/Folder not found!!");
		}
	}
}
