package jspider;

class Variable {
	//Global Variable
	int a;
	String b;
	
	Variable(int a, String b) {
		this.a = a;
		this.b = b;
	}


	public static void main(String[] args) {
		//Initializing Global Variable
		Variable v1 = new Variable(10,"Sample");
		
		//Local Variable
		int a=20;
		String b="Sample main";
		
		System.out.println("Global Variable: "+v1.a+" and "+v1.b);
		System.out.println("Local Variable: "+a+" and "+b);
		
	}
}
