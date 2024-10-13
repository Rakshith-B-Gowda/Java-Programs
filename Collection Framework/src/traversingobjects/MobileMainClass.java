package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

class MobileMainClass {
	public static void main(String[] args) {
		ArrayList<Mobile> al = new ArrayList<Mobile>();
		al.add(new Mobile("IPhone", "XR", 55000));
		al.add(new Mobile("OnePlus", "8", 43000));
		
		Iterator<Mobile> i = al.iterator();
		while (i.hasNext()) {
			Mobile m = i.next();
			System.out.println("Brand: "+m.brand+", ModelNo: "+m.modelNo+", Cost: ₹"+m.cost);
		}
	}
}
