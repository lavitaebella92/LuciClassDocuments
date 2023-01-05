package day13_string;

public class week_2homework17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*17. Write a java program and compute the sum of the digits of an integer. Input = 25
			Expected output = 7
				
	*/	
		
		int input=25;
		
		int num1= input %10; //5 because its 10 it takes the 5
		
		System.out.println(num1);
		
		input /=10;
		
		int num2 = input %10;
		
		
		System.out.println(num2);
		
		System.out.println(num1 +num2);
		
		
		
		
		
		
		
	}

}
