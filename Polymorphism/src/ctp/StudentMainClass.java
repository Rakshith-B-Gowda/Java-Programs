package ctp;

class StudentMainClass {
	public static void main(String[] args) {
		Student s = new Student();
		s.display(21);
		s.display("Rakshith");
		s.display(21, "Rakshith");
		s.display("Rakshith", 21);
	}
}
