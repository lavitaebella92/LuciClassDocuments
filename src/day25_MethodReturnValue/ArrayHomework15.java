package day25_MethodReturnValue;

import java.util.Arrays;

public class ArrayHomework15 {

	    public static void main(String[] args) {
//	    Write a program that can reverse a two dimensional array (return new array)
//	    Example:
	//
//	    input:
//	    array = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
	//
//	    output:
//	    reverse = {{13,12,11,10,9,8}, {7,6,5,4}, {3,2,1}};
	        
	        
	        int array[][] = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
	        
	        int arr2[][] = new int [array.length][];
	        int index = 0;
	        
	        for (int i = array.length -1 ; i >= 0 ; i--) {
	            //System.out.println(Arrays.toString(array[i]));
	            
	            int arr[] = ArrayUtil.reverseIntArr(array[i]);
	            
	            //System.out.println(Arrays.toString(arr));
	            
	            arr2[index] = arr;
	            index++;
	            
	            
	        }
	        
	        
	        for (int[] a : arr2) {
	            System.out.println(Arrays.toString(a));
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }
	}