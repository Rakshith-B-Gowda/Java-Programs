package rtp;

class Employee {
	
	void work() {
		System.out.println("Employee is working");
	}
}
			   // rule-1
class Developer extends Employee{
	@Override  // rule-2
	void work() {
		System.out.println("Developing App!!");
	}
}
			// rule-1
class Tester extends Employee{
	@Override // rule-2
	void work() {
		System.out.println("Testing App!!");
	}
}