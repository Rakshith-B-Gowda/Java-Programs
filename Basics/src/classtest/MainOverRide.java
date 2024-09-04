package classtest;

public class MainOverRide {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.makeSound();
		System.out.println("-------");
		c.makeSound();
	}
}
