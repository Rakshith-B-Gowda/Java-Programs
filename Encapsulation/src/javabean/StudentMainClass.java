package javabean;

class StudentMainClass {
	public static void main(String[] args) {

		Student s = new Student();
		
		s.setAge(21);
		
		int age = s.getAge();
		System.out.println("Age: "+age);
		
		System.out.println("Age: "+s.getAge());
	}
}
