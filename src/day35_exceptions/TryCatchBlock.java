package day35_exceptions;

public class TryCatchBlock {

	public static void main(String[] args) {
		/*
		try {
			//your code
		}catch (exception type) {
			your exception handling code here
		}
		 */
		
		
		
		
		int a=5; 
		int b=0;
		try {
			System.out.println(a/b);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Program is completed");
		
		
		
		
	}

}
