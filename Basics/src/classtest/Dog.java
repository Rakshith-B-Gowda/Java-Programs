package classtest;

public class Dog extends Animal{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("Dog Barks");
	}

}
