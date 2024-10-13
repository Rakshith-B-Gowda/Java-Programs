package com;

import java.io.File;
import java.io.FileReader;

class ReadDemo {
	public static void main(String[] args) throws Exception {
		
		File f = new File("student.txt");
		
		FileReader fr = new FileReader(f);
		
		int ch = fr.read();
		while (ch != -1) {
			System.out.print((char)ch);
			ch = fr.read();
		}
		
		fr.close();
	}

}
