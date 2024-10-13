package com;

import java.io.File;
import java.io.IOException;

class Test {
	public static void main(String[] args) throws IOException {
		
		// .txt, .doc, .docx, .xlsx, .pdf
		File f = new File("demo.txt");
		
		System.out.println(f.createNewFile());
	}
}
