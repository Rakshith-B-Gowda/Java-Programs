package jspider;

public class StaticNonStatic {
	static int a=100;
	int b=200;
	
	static void example() {
		
		System.out.println("Static Method Called");
		System.out.println();
	}
	
	void nonStaticMethod() {
		
		System.out.println("Non-Static Method Called");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Static a= "+a);
		example();
		
		StaticNonStatic s1 = new StaticNonStatic();
		
		System.out.println("Non-Static b= "+s1.b);
		s1.nonStaticMethod();
	}
	
}
