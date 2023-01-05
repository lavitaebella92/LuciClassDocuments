package day06_operators;

public class ExecutionOrder {

	public static void main(String[] args) {
		
//		PEMDAS (Parenthesis, Exponents, Multiplication and Division, Addition and Subtraction) order. 
		
//      Java reads from left to right.		
		
		
		int result1 =10 + 5 -6;
		System.out.println(result1); //9
		
		result1 = 10 + (5-6);
		System.out.println(result1);
		result1 =10 + 5 * 6;
		System.out.println(result1);
		result1 = 10 * 5 - 2 *(40-2);
		System.out.println(result1);
		
		result1 = 10 *5 -2 * (40-2) * (-2);
		System.out.println(result1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
