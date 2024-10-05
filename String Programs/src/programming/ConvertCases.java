package programming;

// Convert upper case to lower case and visa versa

class ConvertCases {
	public static void main(String[] args) {
		String str = " JBbdvj JNJBcd HUBubub";
		System.out.println("Original String: "+str);
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i]+32);
			} else if(ch[i] >= 'a' && ch[i] <= 'z'){
				ch[i] = (char) (ch[i]-32);
			}
		}
		str = new String(ch);
		System.out.println("Converted String: "+str);
	}
}
