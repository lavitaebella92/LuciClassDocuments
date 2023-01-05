package day24;

public class MethodIntro {

	public static void main(String[] args) {

		displayHello(); // calling the display hello method
		displayHello();
		displayHello();

		System.out.println("--------------");

		dislayHello10Times();

		System.out.println("--------------");

		sayHelloToJuret();

		sayHelloToSomeone("TechCircle");

		sayHelloToSomeone("Syed");

		sayHelloToSomeone("Rimer");

	}

	// access Modififer returnType methodName(parameters){
//	        your statement
	// }

	public static void displayHello() {
		System.out.println("Hello");
	}

	public static void dislayHello10Times() {
		for (int i = 1; i < 11; i++) {
			System.out.println("Hello");
		}
	}

	public static void sayHelloToJuret() {
		String name = "Juret";
		System.out.println("Hello " + name);
	}

	public static void sayHelloToSomeone(String name) {

		System.out.println("Hello " + name);
	}

}
