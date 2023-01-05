package day19_arrayreview;

import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers= new int[10];
		
		//whole number (byte, short, int, long) = initial value =0
		//fraction (float, double)= initial value (0.0)
		// char - ASCII number of 0
		//boolean =initial as false
		//String[] = inital value is null
		
		
		//isTrue is just the name of the variable, not sure why teacher picked that as name .- .
		boolean [] isTrue=new boolean[5];
		System.out.println(Arrays.toString(isTrue));// to print array you put sysout, print, arrays.toString
		
		
		System.out.println("***********");
		
		//Acess size 
		System.out.println(isTrue.length);
		
		System.out.println("***********");
		
		
		//Set Array
		isTrue[0]=true;
		
		
		//Access Array
		System.out.println(isTrue[0]);
		System.out.println(Arrays.toString(isTrue));
		
		
		System.out.println("***********");
		
		//Acess size
		System.out.println(isTrue.length-1);
		
		System.out.println("***********");
		//Acess each member of the Array, here you can change its value , but you cannot remove the array
		
		for (int i=0; i<isTrue.length; i++) {
			System.out.println(isTrue[i]);
			
			
			
			
			
		}
		
	}

}
