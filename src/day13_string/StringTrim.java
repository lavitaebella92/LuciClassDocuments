package day13_string;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "          hello           "; //has space
		
		System.out.println(str);
		System.out.println(str.length()); //26
		str = str.trim(); // trim method
		
		System.out.println(str); //hello after trim it takes space off from the beginning and end but not middle 
		System.out.println(str.length()); // 5
		
		String str2= "             hello                 techcircle             ";		
		
		System.out.println(str2);
		System.out.println(str2.length());
		str2 =str2.trim();
		System.out.println(str2);
		System.out.println(str2.length());
		
		
		
		
		
	}

}
