package defalultsorting;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	Double salary; // Wrapper Class declaration to call compareTo() of Double class  
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ID: "+id+" Name: "+name+" Salary: "+salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.salary.compareTo(o.salary);
	}
}

/**
 *  this  ->   Current Object to be INserted
 *  o     ->   Already Existing Object
 *  
 *   -> Sorting based on id (int):
 *  	1. Ascending Order    ->   return this.id - o.id;
 *  	2. Descending Order   ->   return o.id - this.id;
 *  
 *   -> Sorting based on name (String) -> calling compareTo() of String class:
 *   	1. Ascending Order    ->   return this.name - o.name;
 *  	2. Descending Order   ->   return o.name - this.name;
 *   
 *   -> Sorting based on salary (Double) -> calling compareTo() of Double class:
 *   	1. Ascending Order    ->   return this.salary - o.salary;
 *  	2. Descending Order   ->   return o.salary - this.salary; 
 *  
 */








