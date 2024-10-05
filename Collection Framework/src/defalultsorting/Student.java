package defalultsorting;

class Student implements Comparable<Student>{

	int age;

	Student(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Age:"+age;
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
}

/**  this              ->   current object to be inserted
 * 	 o                 ->   already existing object
 * 
 *   Ascending Order   ->   return this.age - o.age;
 *   Descending Order  ->   return o.age - this.age; 
 *  
 */

















