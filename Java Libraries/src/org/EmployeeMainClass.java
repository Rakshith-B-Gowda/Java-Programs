package org;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(20);
		
		Employee[] emp = {e1, e2};
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
	}
}
/* Note:
 * When we print emp[i], we are printing e1 & e2, which are reference variable,
 *  which will call toString() implicitly.
 */
