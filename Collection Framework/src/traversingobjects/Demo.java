package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

class Demo {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("-----");
		
		for (Integer i : al) {  // for(int i : al)
			System.out.println(i);
		}
		
		System.out.println("------");
		
		Iterator<Integer> i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}



















