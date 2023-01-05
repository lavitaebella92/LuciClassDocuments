package day11_nestedloops;

public class EmptyString {
	
	// instance variable 
	static String name; // prints out null

	public static void main(String[] args) {
		     String str ="";
			String str2= new String(); // this 2 strings str/str2 is called no argument constructor
		
		System.out.println(str); //prints out 0
		System.out.println(str2);	//prints out 0
		
		// it will print nothing because it has no value inside

		
		System.out.println(str.length());
		System.out.println(str2.length());
		
		
		System.out.println(name);
	}

}
