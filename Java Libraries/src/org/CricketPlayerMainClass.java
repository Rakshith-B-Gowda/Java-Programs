package org;

class CricketPlayerMainClass {
	public static void main(String[] args) {
		CricketPlayer cp1 = new CricketPlayer("Virat", 12000);
		CricketPlayer cp2 = new CricketPlayer("KL Rahul",10000);
		CricketPlayer cp3 = new CricketPlayer("Sachin",50000);
		
		CricketPlayer[] cpa = {cp1,cp2,cp3};
		
		for (int i = 0; i < cpa.length; i++) {
			System.out.println(cpa[i]);
		}
	}
}