package day27_ReviewWithLang;

public class MethodReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   // Method is consist with
	    // - Access modifier (optional)
	    // - return type, if none => void
	    // - methodName (camelCase) has to describe what the method does
	    // - (dataType paramName, dataType paramName) parameter(s)
	    // - {...} method body
	    
	    // Method should only does one thing
	    
	    // Method Overload Rule
	    // - same class
	    // - same signature, but difference parameter
	    // - java will know which method to use before it run (compile time)
	    sayHello(6, "Leng");
	    sayHello(4);
	    sayHello();
	    
	    sayHello(5, biggerCase("Tom")); // argument(s)
	    String word = biggerCase("someWord");
	    System.out.println(word);
	    printBiggerCase("someWord");
	    
	    System.out.println(5);
	    System.out.println('C');
	    System.out.println(true);
	  }

	  // SayHi Method , parameterize method
	  static void sayHello(int num, String name) { // method signature
	    for (int i = 0; i < num; i++) {
	      System.out.println("Say, Hi "+name);
	    }
	  }
	  // method overload
	  static void sayHello(int num) { // method signature
	    for (int i = 0; i < num; i++) {
	      System.out.println("Say, Hi");
	    }
	  }
	  static void sayHello() { // method signature
	    System.out.println("Say, Hi");
	  }

	  // return method
	  static String biggerCase(String word) {
	    return word.toUpperCase();
	  }

	  static void printBiggerCase(String word) {
	    System.out.println(word.toUpperCase());
	  }
	}


