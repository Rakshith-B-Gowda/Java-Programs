package org;

class CalculatorImpl implements Calculator{
	
	@Override
	public void add(int a, int b) {
		System.out.println("\tSum of "+a+" & "+b+" is "+(a+b));
	}
	
	@Override
	public void sub(int a, int b) {
		System.out.println("\tSubtraction of "+a+" & "+b+" is "+(a-b));
	}
	
	@Override
	public void mul(int a, int b) {
		System.out.println("\tMultipication of "+a+" & "+b+" is "+(a*b));
	}
	
	@Override
	public void div(int a, int b) {
		System.out.println("\tDivision of "+a+" & "+b+" is "+((double)a/b));
	}
}
