package comparingobjects;

class Student {
	int age;

	Student(int age) {
		this.age = age;
	}
	
	public boolean equals(Object obj) {//1. Upcasting -> Object obj = new Student(20);
		if(obj instanceof Student) {   //2. checking if obj is having student object 	
			Student s = (Student) obj; //3. Downcasting
			return this.age == s.age;  //4. Comparison Logic -> s1.age == s2.age;
		}
		return false;                  //5. Returning false for negative scenario
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(25);
		Student s2 = new Student(25);
		System.out.println(s1.equals(s2)); // s1.equals(new Student(20));
	}
}
//s1 -> this
//s2 -> obj (upcasted reference) -> s (downcasted reference)




