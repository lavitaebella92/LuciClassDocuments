package day06_operators;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // creating instance of scanner object 
		                                       // Class instantiation 
		System.out.println("Please enter a number:");
//		int num=scan.nextInt();
//		System.out.println("You have entered " + num);
		
		
		
//		
//		int num =5;
//		
		int num = scan.nextInt();
		
		String str = (num % 2 == 0) ? "Even" : "Odd";
		
		System.out.println(str);
//		
  		scan.close();
  		
		
	

	}

}
