package day11_nestedloops;

public class StringWithConstructor {

	public static void main(String[] args) {
		
		
		String str = "";
		String str2 ="Java";
		String str3= new String ();
		String str4= new String("Java");
		char [] word = { 'j', 'a', 'v', 'a'};
		String str5= new String(word) ; // this will be the only thing that prints due to the word above 
		
		
		System.out.println(str5);
		
		
	}

}
