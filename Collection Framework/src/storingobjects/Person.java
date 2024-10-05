package storingobjects;

class Person {
	
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
	
	
}
