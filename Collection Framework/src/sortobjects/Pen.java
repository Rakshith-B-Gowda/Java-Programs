package sortobjects;

class Pen implements Comparable<Pen>{
	
	int cost; // Integer cost;

	Pen(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Cost: "+cost;
	}

	@Override
	public int compareTo(Pen o) {
		return this.cost - o.cost; // return this.cost.compareTo(o.cost);
	}
	
}
