package storingobjects;

import java.util.ArrayList;

class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(21, "Rakshith");
		Student s2 = new Student(23, "Prajwal");
		Student s3 = new Student(50, "Rahul");

		ArrayList<Student> studs = new ArrayList<Student>();
		studs.add(s1); // studs.add(new Student(21, "Rakshith"));
		studs.add(s2); // studs.add(new Student(23, "Prajwal"));
		studs.add(s3); // studs.add(new Student(50, "Rahul"));

		for (int i = 0; i < studs.size() ; i++) {
			System.out.println(studs.get(i)); // printing ref var -> s1, s2, s3 -> toString()
		}

		System.out.println("-------");

		for (Student student : studs) {
			System.out.println(student); // printing s1, s2, s3 (ref var) -> toString()
		}
	}
}
