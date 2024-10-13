package mapexamples;

import java.util.Set;
import java.util.TreeMap;

class StudentMainClass {
	public static void main(String[] args) {
		
		Student s1 = new Student(22, "Rakshith");
		Student s2 = new Student(25, "Tom");
		Student s3 = new Student(18, "Jerry");
		
		StudentAgeComparator ageSorting = new StudentAgeComparator();
		StudentNameComparator nameSorting = new StudentNameComparator();
		
		TreeMap<Student, Integer> map = new TreeMap<Student, Integer>(ageSorting);
		map.put(s1, 85);
		map.put(s2, 95);
		map.put(s3, 75);
		
		Set<Student> students = map.keySet();
		for (Student student : students) {
			System.out.println(student+" Marks: "+map.get(student));
		}
		
//		System.out.println("------------");
//		
//		TreeMap<Student, Integer> map2 = new TreeMap<Student, Integer>(new StudentNameComparator());
//		map2.put(s1, 85);
//		map2.put(s2, 95);
//		map2.put(s3, 75);
//		
//		System.out.println("Based on Name: ");
//		
//		Set<Student> students2 = map2.keySet();
//		for (Student student : students2) {
//			System.out.println(student+" Marks: "+map2.get(student));
//		}
	}
}
