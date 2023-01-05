package day05_operators;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Relational Operator ==>result will always be boolean
		// ==, != , > , < , >= , <=

		int num1 = 2;
		int num2 = 3;
		int num3 = 5;
		int num4 = 5;

		//

		System.out.println(num1 == num2); // 2==3 // False
		System.out.println(num1 + num2 == num3); // true
		System.out.println(num3 == num4); // true

		// not equal is  !=
		
		System.out.println(num1!=num2); //true (2 is not equal to 3)
		
		System.out.println(num3!=num4); //false
		
		
		// >
		
		System.out.println(num1 > num2); //false
		
		boolean result =num1> num2; 
		System.out.println(result); //false
		
		
		
		System.out.println(num1 < num2); //true
		
		result =num1<num2;
		
		System.out.println(result);
		
		result = num1 + num2 >num3;
		
		System.out.println(result);
		
		  // 2+3 >=5 
		result = num1 + num2 >= num3;
		System.out.println(result);
		
		
		System.out.println(num3-num2 <= num1); // 5-3 <= 
		
		
		
		
		
		
		
 
	}

}
