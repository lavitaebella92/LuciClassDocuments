package day17_array;

import java.util.Arrays;

public class InitializingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums= new int [5]; // intialized an array that can store 5 elements 
		
		System.out.println(nums.length); // 5
		
		
		System.out.println(nums[0]);// 0 because is defaults value
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		//System.out.println(nums[5]); // will give you error 
		
		//assigning value to the array
		//nums is the name of the array here 
		nums[4] =90;
		
		System.out.println(nums); // memory location
		
		System.out.println(Arrays.toString(nums)); // this will display everything 0,0,0,0,90 
		
		nums[1]=50;
		
		System.out.println(Arrays.toString(nums));
		
         nums[1]=5000;
		
		System.out.println(Arrays.toString(nums)); // you can re assing value to same postion 
		
		String[] fruits=new String [3];
		
		fruits [0]= "apple";
		fruits [1]="orange";
		fruits [2]="banana";
		
		System.out.println(fruits[1]); //orange 
		
		fruits[1] ="water melon";
		
		System.out.println(fruits[1]);// water melon
		
		/// you can update value but you can not resize the array
		
		
		
		
		
		
		
		
		
		
	}

}
