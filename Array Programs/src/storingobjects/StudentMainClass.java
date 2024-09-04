package storingobjects;

class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(95, "Rakshith");
		Student s2 = new Student(35, "Rahul");
		
		Student[] s = {s1,s2};
		
		for(int i = 0; i<s.length; i++) {
			
			System.out.println("Student Name: "+s[i].name+" Marks: "+s[i].marks);
			
			
		}
	}

}
