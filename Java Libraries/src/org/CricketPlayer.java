package org;

class CricketPlayer {

	String name;
	int runs;
	
	CricketPlayer(String name, int runs) {
		this.name = name;
		this.runs = runs;
	}

	@Override
	public String toString() {
		return name+" has scored "+runs+" runs.";
	}
}
