package mapexamples;

import java.util.HashMap;
import java.util.Map;

class Demo {
	public static void main(String[] args) {
		// HashMap map = new HashMap();
		Map map = new HashMap(); // Upcasting
		map.put(10, "hai");
		map.put("bye", 1.2);
		map.put(1.5, 55);
		
		System.out.println(map); // {1.5=55, 10=hai, bye=1.2}
		System.out.println(map.size()); // 3
		System.out.println(map.get(10)); // hai 
		System.out.println(map.get(200)); // null
		System.out.println(map.containsKey(1.5)); // true
		System.out.println(map.containsValue("Hai")); // false
		System.out.println("-------");
		
		System.out.println(map); // {1.5=55, 10=hai, bye=1.2}
		map.remove(10);
		System.out.println(map); // {1.5=55, bye=1.2}
		System.out.println("-------");
		
		System.out.println(map.isEmpty()); // false
		map.clear();
		System.out.println(map.isEmpty()); // true
	}
}
