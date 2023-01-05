package day17_array;

import java.util.Arrays;

public class ArraySortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {3,2,1,5,6};
		
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		
		System.out.print(Arrays.toString(nums));
		
		String fruits[] = {"pinapple", "apple","kiwis", "orange", "mango"};
		
		System.out.println(Arrays.toString(fruits));
		
		Arrays.sort(fruits);
		
		System.out.print(Arrays.toString(fruits));
		
		
		System.out.println(nums[0]);//min value printing the sorted value
		
		System.out.println(nums[4]);//max value the sorted value
		
		
		
		
		
		
	}

}
