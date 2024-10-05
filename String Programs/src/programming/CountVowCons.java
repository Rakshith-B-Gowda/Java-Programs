package programming;

// Count Vowels and consonants in the String

class CountVowCons {
	public static void main(String[] args) {
		String str = "This is a Sample String";
		int vc=0, cc=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				switch (ch) {
				case 'A' , 'E', 'I','O','U','a','e','i','o','u': 
					vc++;
				default:
					cc++;
				}
			}
		}
		System.out.println("Vowels count: "+vc);
		System.out.println("Consonents count: "+cc);
	}
}
