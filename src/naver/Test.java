package naver;

class Animal {
	public static void speak() {
		System.out.println("animal");
	}

}

class Cat extends Animal {
	public static void speak() {
		System.out.println("cat");
	}
}

class Dog extends Animal {
	public static void speak() {
		System.out.println("dog");
	}
}

public class Test {

	public static void main(String[] arg) {
		Animal a = new Cat();
		// Cat c = new Animal();
		a.speak();
	}

}