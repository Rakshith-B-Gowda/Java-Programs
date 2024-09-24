package programming;

import java.util.Scanner;

// Swap first and last character of same word

class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		sc.close();
		System.out.println("Original String: "+str);
		System.out.println("Swapped String: "+swapFLWord(str));
	}

	static String swapFLWord(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
				for (int j = i+1; j < ch.length; j++) {
					if (j==ch.length-1 && ch[j]!=' ' || ch[j]!=' ' && ch[j+1]==' ') {
						ch[i] = (char)(ch[i] + ch[j]);
						ch[j] = (char)(ch[i] - ch[j]);
						ch[i] = (char)(ch[i] - ch[j]);
						break;
					}
					else if(j==' '){
						break;
					}
						
				}
			}
		}
		return new String(ch);
	}
}
