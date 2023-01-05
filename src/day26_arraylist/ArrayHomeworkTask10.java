package day26_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayHomeworkTask10 {

	public static void main(String[] args) {

//      Write a program that can merge 3 arrays of integers
//
//      Example:
//
//      Input:
//      arr1 = {30, 10, 20}; 
//      arr2 = {15, 40, 25, 35}; 
//      arr3 = {8, 9, 17, 5, 4, 1} 
//
//      Output:
//      {30,10,20,15,40,25,35,8,9,17,5,4,1}

		ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(30, 10, 20));
		ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(15, 40, 25, 35));
		ArrayList<Integer> listC = new ArrayList<>(Arrays.asList(8, 9, 17, 5, 4, 1));

		listB.addAll(listA);
		listC.addAll(listB);

		// System.out.println(listC);
		Collections.sort(listC);
		System.out.println(listC);
		
		
		
		
		//Another way to do it:
		
	      int[] arr1 = {30, 10, 20};
	        int[] arr2 = {15, 40, 25, 23};
	        int[] arr3 = {8, 9, 17, 5, 4, 1};
	        
	        ArrayList<Integer> nums = new ArrayList<>();
	        
	        for (int i = 0 ; i < arr1.length ; i++) {
	            nums.add(arr1[i]);
	        }
	        
	        
	        for (int i = 0 ; i < arr2.length ; i++) {
	            nums.add(arr2[i]);
	        }
	        
	        for (int i = 0 ; i < arr3.length ; i++) {
	            nums.add(arr3[i]);
	        }
	        
	        System.out.println(nums);
	        

	}

}
