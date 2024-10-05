package defalultsorting;

import java.util.TreeSet;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Rakshith", 3.1);
		Employee e2 = new Employee(112, "Rahul", 3.2);
		Employee e3 = new Employee(320, "Yatish", 3.3);
		Employee e4 = new Employee(420, "Prajwal", 1254.5);
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		for (Employee emp : ts) {
			System.out.println(emp);
		}
	}
}
