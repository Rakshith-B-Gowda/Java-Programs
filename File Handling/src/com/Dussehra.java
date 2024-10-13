package com;

import java.io.File;
import java.io.FileWriter;

class Dussehra {
	public static void main(String[] args) throws Exception {
		File f = new File("dasara.txt");
		
		// Append -> FileWriter fw = new FileWriter(f , true );  append = true
		FileWriter fw = new FileWriter(f);
		
		String str = "Happy Dasar & kindly do not forget Java";
		
		fw.write(str);
		fw.flush();
		fw.close();
		
		System.out.println("Data Written!!");
	}
}
