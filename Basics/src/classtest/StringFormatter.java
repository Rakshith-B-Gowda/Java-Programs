package classtest;

class StringFormatter {
	public static void format(String s) {
		System.out.println("Formatted String: "+s);
	}
	
	public static void format(String s,int a) {
		System.out.println("Formatted String: "+s+a);
	}
	
	public static void format(String s,String s2) {
		System.out.println("Formatted String: "+s+s2);
	}
	
	public static void main(String[] args) {
		
		format("Sample");
		format("Sample", 300);
		format("First", "Second");
	}
}
