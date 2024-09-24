package day3;

import java.io.*;

class ThrowsDemo3 {

	public static void read() throws FileNotFoundException {
		FileReader f = new FileReader("student.txt");
	}
	
	public static void main(String[] args) {
		try {
			read();
		} catch (FileNotFoundException e) {
			System.out.println("Handled :"+e);
		}
	}
}
