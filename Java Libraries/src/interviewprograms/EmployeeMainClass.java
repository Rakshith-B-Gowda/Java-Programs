package interviewprograms;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee("Rakshith", 350000.55);
		Employee e2 = new Employee("Rahul", 1250000.55);
		Employee e3 = new Employee("Prajwal", 550000.55);
		
		findHighestSalary(e1,e2,e3);
	}

	static void findHighestSalary(Employee e1, Employee e2, Employee e3) {
		
		String name = (e1.salary > e2.salary) ? (e1.salary>e3.salary ? e1.name : e3.name) : (e2.salary>e3.salary ? e2.name : e3.name);
		System.out.println(name+" has highest salary");
	}
}
