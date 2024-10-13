package com;

import java.io.File;
import java.io.FileWriter;

class WriteDemo {
	public static void main(String[] args) throws Exception {
		
		File f = new File("student.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("Hello World!!");
		
		fw.flush();
		
		fw.close();
		
		System.out.println("Data Written!!");
		
	}
}
