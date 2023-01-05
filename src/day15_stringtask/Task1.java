package day15_stringtask;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Task1

		write a program that asks user to enter a sentence. 
		then print the first & last characters of the sentence

		Example: Input: Welcome To TechCircle 
		output: We */
		
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String input = scan.next();
        String output  = "";
//        System.out.println(input.charAt(0));
//        System.out.println(input.charAt(4));
//        System.out.println(input.length());//5
//        
//        System.out.println(input.charAt(input.length()-1));
        output+= input.charAt(0);
        
        output += input.charAt(input.length()-1);
        System.out.println(output);
        
        scan.close();
		
		
		
		
		
		
		
		
		
	}

}
