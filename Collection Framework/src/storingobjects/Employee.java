package storingobjects;

class Employee {

	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return "ID: "+id+" NAME: "+name+" SALARY: "+salary+" LPA.";
	}
}
