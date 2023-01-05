package day25_MethodReturnValue;

import java.util.Arrays;

public class ArrayUtil {

	   // Reversing Integer Array 

	    
	    public static void main(String[] args) {
	        int arr[] = {1,2,3,4,5,6}; // {3,2,1}
	        int arr3[] = {2,33,4,1,1}; 
	        
	        int arr2[] = reverseIntArr(arr);
	        
	        
	        System.out.println(Arrays.toString(arr2));
	        System.out.println(Arrays.toString(reverseIntArr(arr3)));
	        
	    }
	    
	    public static int[] reverseIntArr(int arr[]) {
	        //int arr[] = {1,2,3,4,5,6}; // {3,2,1}
	        int arr2[] = new int[arr.length];
	        int index = 0;
	        for (int i = arr.length -1 ; i >=0 ; i--) {
	            //System.out.println(arr[i]);
	            arr2[index] = arr[i];
	            index ++;
	        }
	        
	        return arr2;
	    }
	    
	    
	    
	    
	    
	    
	}