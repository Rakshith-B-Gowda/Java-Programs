package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

class Runner {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rakshith");
		al.add("Out");
		al.add("Razor");
		
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
