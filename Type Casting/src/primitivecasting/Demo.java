package primitivecasting;

public class Demo {
	public static void main(String[] args) {
		//Widening -> Converting Smaller type to Bigger type (Implicitly)
		int a = 10;
		float b= a;
		System.out.println(a+" "+b);//10 10.0
		
		double c = 35;
		System.out.println(c);//35.0
		
		char x = 'A';
		int y = x;
		System.out.println(x+" "+y);//A 65
		
		System.out.println("-------");
		
		//Narrowing -> converting bigger type to smaller type (Explicitly)	
		double i =12.34;
		int j = (int) i;
		System.out.println(i+" "+j);//12.34  12
		
		int k = (int) 50.67;
		System.out.println(k);//50
		
		int p = 97;
		char q = (char) p;
		System.out.println(p+" "+q);//97 a
		
		System.out.println("-------");
		
		System.out.println((int)97.88);//97
		System.out.println((char)65);//
		System.out.println("A"+"B");//AB
		System.out.println("A"+10);//A10
		System.out.println('A'+"B");//AB
		System.out.println("A"+10+20);//A1020
		System.out.println(10+20+"A");//30A
		System.out.println('A'+'B');//131
		System.out.println('a'+20);//117
		
	}

}
