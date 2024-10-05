package storingobjects;

import java.util.LinkedList;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Rakshith", 5.5);
		Employee e2 = new Employee(103, "Rahul", 6.7);
		Employee e3 = new Employee(105, "Prajwal", 10.5);
		
		LinkedList<Employee> ll = new LinkedList<Employee>();
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		
		for (Employee emp : ll) {
			System.out.println(emp);
		}
	}
}
