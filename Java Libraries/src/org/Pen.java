package org;

class Pen {

	int cost;

	Pen(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Cost :"+cost;
	}
	
	public static void main(String[] args) {
		Pen p1 = new Pen(35);
		Pen p2 = new Pen(55);
		
		System.out.println(p1); // p1.toString();
		System.out.println(p2); // p2.toString();
	}
}
