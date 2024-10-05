package defalultsorting;

class Person implements Comparable<Person>{
	 
	int age;
	String name;
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return name+" is "+age+" years old.";
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}
}












