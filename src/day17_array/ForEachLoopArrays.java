package day17_array;

public class ForEachLoopArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//datatype refers to :string, int, ... any variable representing the array
		
		//for ( datatype variable name : _____){
			//Sytem.out.println(__);
	  
		//example:
		
//                         0  1  2  3  4 
		int[] numbers = { 2, 4, 6, 8, 10 };

		for (int n : numbers) {
			System.out.println(n);
		}

		System.out.println("========"); // this is the same  both samples.

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		
		String names[]= {"Brandon","Ali","Karen","Elzat", "Nazanin", "Raheel"};
		
		/* Syntax:
		 * for (dataType variableName:array){
		 * statement
		 */
		
		
		for (String name:names) {
			System.out.println(name);
		}
		
		
		for (String a: names) {
			if (a.contains("e")) {
				System.out.println(a);// Karen and Raheel 
			}
		}
		
		//display all the name end wth character 'n'
		// logic on how to get the last character
//		String name= "Brandon";
//		System.out.println(name.charAt(name.length()-1));
//		
		
		System.out.println("------------");
				
		for (String name: names) {
			
			if (name.charAt(name.length()-1) =='n') {
				System.out.println(name);
			}
		}
		
		
		// another way
		
		for (String name :names) {
			if(name.endsWith("n")) {
				System.out.println(name);
			}
		}
		
		
		for (String name: names) {
			
			if (name.charAt(name.length()-1) =='n') {
				System.out.println(name);
			}
		}
		
		System.out.println("------------");
		// another way
		
		for (String name :names) {
			if(name.endsWith("n")) {
				System.out.println(name);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}