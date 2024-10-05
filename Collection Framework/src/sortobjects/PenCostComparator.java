package sortobjects;

import java.util.Comparator;

class PenCostComparator implements Comparator<Pen>{

	@Override
	public int compare(Pen o1, Pen o2) {
		return o1.cost - o2.cost;
	}
}
