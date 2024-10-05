package programming;

// Print how many upper case, lower case, digits, special characters present in the String 

class CountStringChar {
	public static void main(String[] args) {
		String str = " This Is a sAmpL555e %$STrinzG";
		char[] ch = str.toCharArray();
		int uc=0, lc=0, dc=0, spc=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				uc++;
			}
			else if (ch[i] >= 'a' && ch[i] <= 'z') {
				lc++;
			}
			else if (ch[i] >= '0' && ch[i] <= '9') {
				dc++;
			}
			else {
				spc++;
			}
		}
		System.out.println("Upper case count = "+uc);
		System.out.println("Lower case count = "+lc);
		System.out.println("Digits count = "+dc);
		System.out.println("Special character count = "+spc);
	}
}
