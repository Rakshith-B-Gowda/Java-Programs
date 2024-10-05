package sortobjects;

import java.util.Comparator;

class MobileCostComparator implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.cost - o2.cost;
	}
}
