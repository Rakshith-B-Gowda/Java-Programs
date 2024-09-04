package com;

class MainSolution {
	static void selectState(India obj) {
		if (obj instanceof Karnataka) {
			System.out.println("Downcasting to Karnataka");
			Karnataka k = (Karnataka) obj;
			System.out.println("PM: "+k.pm+" CM: "+k.cm);
		}
		else if (obj instanceof TamilNadu) {
			System.out.println("Downcasting to Tamil Nadu");
			TamilNadu tn = (TamilNadu) obj;
			System.out.println("PM: "+tn.pm+" CM: "+tn.cm);
		}
		else if (obj instanceof Goa) {
			System.out.println("Downcasting to Goa");
			Goa g = (Goa) obj;
			System.out.println("PM: "+g.pm+" CM: "+g.cm);
		}
	}
	
	public static void main(String[] args) {
		selectState(new Karnataka());
		System.out.println("---------");
		selectState(new TamilNadu());
		System.out.println("---------");
		selectState(new Goa());
	}
}
