package day29_encapsulation;

public class Dog {
	String name, breed, size;
	char gender;
	int age;

//Dog(){};

	Dog(String n) {
		name = n;
	}

	public Dog(char g) {
		gender = g;
	}

	public Dog(int a) {
		age = a;
	}

	public Dog(String n, String b) {
		name = n;
		breed = b;
	}

	public void eat() {
		System.out.println(name + " is eating bone");
	}

	public void play() {
		System.out.println(name + " is playing");
	}

	public void bark() {
		System.out.println(name + " is barking");
	}

	public void setInfo(String n, String b, String s, char g, int a) {
		name = n;
		breed = b;
		size = s;
		gender = g;
		age = a;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", size=" + size + ", gender=" + gender + ", age=" + age
				+ "]";
	}
}
