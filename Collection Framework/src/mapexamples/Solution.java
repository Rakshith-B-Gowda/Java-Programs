package mapexamples;

import java.util.LinkedHashMap;
import java.util.Set;

class Solution {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> person = new LinkedHashMap<String, Integer>();
		person.put("Tom", 21);
		person.put("Rakshith", 22);
		person.put("Rahul", 23);
		
		Set<String> keys = person.keySet();
		
		for (String key : keys) {
			System.out.println(key+" is "+person.get(key)+" years old");
		}
	}
}
