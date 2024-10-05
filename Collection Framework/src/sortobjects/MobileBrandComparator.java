package sortobjects;

import java.util.Comparator;

class MobileBrandComparator implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.brand.compareTo(o2.brand);
	}
}
