package day14_subString;

public class ConvertNumberToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =10;
		int num2=20;
		int num3= num + num2;
		System.out.println(num3); //30
		
		String str1= ""+num;
		System.out.println(str1);//10 ( new value of string is 10)
		
		String str2=""+num2;
		
		System.out.println(str2);//20 new value of string is 20)|
		
		
		String str3= str1 +str2;
		System.out.println(str3); // string 3 value is 1020
		
		
		double price =9.99;
		
		String str4=""+price;
		System.out.println(str4.length()); //4
		System.out.println(str4.charAt(1));//.
		
		//
		
		String str5 =Integer.toString(num3);
		System.out.println(str5); //30
		System.out.println(str5.charAt(0)); //3
		
		String str6 =Double.toString(price);
		System.out.println(str6); //9.99
		
		float num5 =9.31f;
		
		String str7= Float.toString(num5);   //01234 
		System.out.println(str7.length());//4 (float)
		
		long id=7564879646L;
		System.out.println(Long.toString(id).length());//10
		
		
		String str8= String.valueOf(false);
		System.out.println(str8.length());//5
		
		System.out.println(String.valueOf(num5)); //9.31
		
		
		
				
	}

}
