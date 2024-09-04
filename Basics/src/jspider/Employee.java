package jspider;

class Employee {
	int eID;
	String cName,eName;
	double salary;
	
	Employee(int eID, String cName, String eName, double salary) {
		this.eID = eID;
		this.cName = cName;
		this.eName = eName;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e1 =new Employee(01, "Jspiders", "Amith", 55000.50);
		Employee e2 =new Employee(02, "Qspiders", "Ramith", 45000.50);
		Employee e3 =new Employee(03, "Pspiders", "Karan", 75000.50);
		
		String res = e1.salary>e2.salary?(e1.salary>e3.salary?e1.eName:e3.eName):(e2.salary>e3.salary?e2.eName:e3.eName);
		
		System.out.println("Highest Salary: "+res);
	}
	
	
}
