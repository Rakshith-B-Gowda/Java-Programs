package mapexamples;

import java.util.Comparator;

class StudentAgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age.compareTo(o2.age);
	}
}
