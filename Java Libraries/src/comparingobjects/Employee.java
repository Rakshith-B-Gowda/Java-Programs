package comparingobjects;

/*
 * Develop a java program to check if the id & salary of 2 Employee objects
 * is same or not, with the help of overriding equals().
 * 
 * Hint: Use Logical AND -> &&
 */

class Employee {
	int id;
	double salary;
	Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			return this.id==emp.id && this.salary == emp.salary;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(10, 55000.50);
		Employee e2 = new Employee(10, 55000.50);
		
		System.out.println(e1.equals(e2));
	}
}
