package day04_introduction_to_java;

public class HelloWorldTest {
	public static void main (String args []) {
	System.out.println("Test"); // comment here too
	
	// comment here
	
	int number /* this is inline comment */=10;
		
		//cmd + shift +/ | ctrl +shift /
		
	/*
	 * whatever 
	 * inside
	 * this
	 */
		
	//dataType variablename =value;
	//int, boolean, double, String
	
	
		boolean isEligible= true;//only true or false
		int myNumber =10; //whole
		double price = 10.99;//decimal 
		char x = 'x';//single letter 
		String color = "blue";//words
		
		//Primitive DataType
		//byte, short, int, long -> whole number
		// float, double -> decimal number / floating number
		// char -> character is a letter
		// boolean -> true/false 
		
		//naming convention
		//-unique 
		//-camelCase
		//-must be unique
		
		//char color = 'y';<- this will not work  
		//-case sensitive
		
		char X = 'x';
		String NameOfSchool = "TechCircle";
		boolean canSwim = true;
		boolean isBig /*big also work but not recommend it*/ = true;
		// -cannot use java reserve keyword
		
		//int private =20; wont work , "private" is the reserve keyword
		
		//when you name you can start with a $
		
		//cannot start with the number //
		
		int thisNumber;
		//do something
		thisNumber =10;
		System.out.println(thisNumber);
		thisNumber =10;
		
		int a = 10, b =11, c =12;  //this will work but not recommended
		//String catName = "Holly", numberNine = 9; // type has to be the same 
		String dog, cat, pony;
		dog ="Maggie";
		cat= "catName";
		pony = "pony";
		
		
		
		System.out.println(thisNumber);
		
		byte monthInYear = 2; //max & min value		
		Short numberOfDayInYear =365; //also has max
		long longNumber =1233_624_242423424239l; //need to end with a letter l -lower case or upper case
		// for the number you can store _ 
		System.out.println(longNumber);
		
		double doubleValue = 1_234_124_135.453243; // 
		float price_B =18.95f;
			
		
		
		
		
		
		
		
		
	}
}