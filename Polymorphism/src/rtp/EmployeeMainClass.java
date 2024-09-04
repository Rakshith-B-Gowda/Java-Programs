package rtp;

class EmployeeMainClass {
	
	//1. display(new Developer()); -> Employee obj = new Developer(); -> obj.work();
	//2. display(new Tester()); -> Employee obj = new Tester(); -> obj.work();
	static void display(Employee obj) {
			obj.work();
		}

	public static void main(String[] args) {
		//1. Upcasting using method
		display(new Developer());
		display(new Tester());
		
		System.out.println("--------");
		
		//2.Upcasting using single reference variable
		Employee emp1 = new Developer();
		emp1.work();
		
		Employee emp2 = new Tester();
		emp2.work();
		
		System.out.println("-------------");
		
		//3. Upcasting using separate reference variable
		Employee emp;
		emp = new Developer();
		emp.work();
		
		emp = new Tester();
		emp.work();
		
	}
}
