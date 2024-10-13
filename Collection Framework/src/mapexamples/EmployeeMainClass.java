package mapexamples;

import java.util.Set;
import java.util.TreeMap;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(302);
		Employee e2 = new Employee(103);
		Employee e3 = new Employee(205);
		Employee e4 = new Employee(205);
		
		TreeMap<Employee, String> map = new TreeMap<Employee, String>();
		map.put(e1, "Rakshith");
		map.put(e2, "Tom");
		map.put(e3, "Jerry");
		map.put(e4, "Jerry Dupe");
		
		Set<Employee> employees = map.keySet();
		for (Employee employee : employees) {
			System.out.println(employee+" Name: "+map.get(employee));
		}
	}
}
