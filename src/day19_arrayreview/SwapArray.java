package day19_arrayreview;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swap array member

//		{1,2}  =>  {2, 1}
//		{10,0}  =>  {0, 10}
//		{4, 8}  => {8, 4}
		
//		int[] pair = { 1, 2 };
//
//		int outputArr[] = new int[pair.length];
//
//		int index = 0;
//
//		for (int i = pair.length - 1; i >= 0; i--) {
//			outputArr[index] = pair[i];
//			index++;
//		}
//		System.out.println(Arrays.toString(outputArr));
//
//		//above is one way to do it 
		System.out.println("*******************");
		
		
		// Given array of 2 member. write logic to Swap first member and last member
	    int[] pair = {1, 2, 3, 4, 5, 6, 7, 8};
	    // {1,2}  =>  {2, 1}
	    // {10,2,4,0}  =>  {0,2,4,10}
	    // {4,1,0,1,0,8}  => {8,1,0,1,0,4}

	    // find first index & last index
	    int firstIndex = 0;
	    int lastIndex = pair.length - 1;
	    
	    // use the to access first & last array member
	    int first = pair[firstIndex];
	    int last = pair[lastIndex];
	    
	    // then swap them
	    int temp = pair[0];
	    pair[0] = pair[pair.length - 1];
	    pair[pair.length - 1] = temp;

	    System.out.println(Arrays.toString(pair));
		
		
	}

}
