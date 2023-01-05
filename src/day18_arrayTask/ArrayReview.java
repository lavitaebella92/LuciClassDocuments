package day18_arrayTask;

import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //	 this is syntax
	//	dataType variableName[] =new dataType[size];
		
		char chars[]=new char[4];
		String str="hello";
		System.out.println(str.length());// number of characters in my string
		System.out.println(chars.length);	// number of elements in your array	
		
		
		System.out.println(chars[1]); // if there is no value it gives you default value , o, null, or no response
		System.out.println("*********************")	;
		// to assing value do this
		
		chars [0]='j';
		chars [1]='a';
		chars [2]='v';
		chars [3]='a';
		
		
		System.out.println(chars[0]);
		System.out.println("*********************")	;	
		float nums[] =new float[3];		// you assigned 3  but start count at 0, = below we assinged 3 
		
		nums[0]=2.2f;
		nums[1]=4.2f;
		nums[2]=6.2f;
		
		System.out.println(Arrays.toString(nums));
		System.out.println("*********************")	;	
		for (int i=0; i <nums.length; i++) {
		System.out.println(i);
		System.out.println(nums[i]);	
	}
		System.out.println("*********************")	;	
		//for (dataType variableName: arrayName){
		//}
		
		for (float juret :nums) {
			System.out.println(juret);
		}
		System.out.println("*********************")	;
		
//      System.out.println();
        			//	0  1    2   3			
		String str2 = "BUY USD SELL RMB";

		String arr[] = str2.split(" ");
		System.out.println(arr.length); // 4
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		System.out.println("*********************")	;
        
		for (int i= 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*********************")	;
		
		
		for (String word : arr) {
			System.out.println(word); //prints same as above 	
		}
		
		System.out.println("*********************")	;
		
		// Do while loop arrays
		int index = 0;

		do {
			System.out.println(arr[index]);
			index++;
		} while (index < arr.length);

		System.out.println("while loop");
		index = 0;

		while (index < arr.length) {
			System.out.println(arr[index]);
			index++;
		}
		
	}
}
