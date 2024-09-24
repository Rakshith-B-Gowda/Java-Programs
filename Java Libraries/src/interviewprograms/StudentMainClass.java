package interviewprograms;

class StudentMainClass {
	
	static void findHighestMarks(Student student1 , Student student2) {
		
		if (student1.marks > student2.marks) {
			System.out.println(student1.name+" has scored Highest Marks");
		}
		else {
			System.out.println(student2.name+" has scored Highest Marks");
		}
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Rakshith", 100);
		Student s2 = new Student("Rahul", 34);
		
		findHighestMarks(s1	, s2);
	}
}
