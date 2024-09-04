package classtest;

public class Cat extends Animal{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("Cat Meows");
	}

}
