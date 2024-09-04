package multilevel;

class Tom extends Employee{
	int age = 21;
	
	public static void main(String[] args) {
		Tom t = new Tom();
		
		t.eat();
		System.out.println("ID: "+t.id);
		t.work();
		System.out.println("Age: "+t.age);
		
	}

}
