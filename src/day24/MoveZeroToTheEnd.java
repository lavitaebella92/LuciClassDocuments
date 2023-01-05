package day24;

import java.util.Arrays;

public class MoveZeroToTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[] = {1,2,3,4,0,0,0,5,6};
	        
	        int zeroAtTheEnd[] = new int [arr.length];
	        
	        System.out.println(Arrays.toString(zeroAtTheEnd));
	        
	        int index = 0;
	        
	        for (int i = 0 ; i < arr.length ; i++) {
	            
	            if (arr[i] != 0) {
	                zeroAtTheEnd[index] = arr[i];
	                index++;
	            }
	            
	        }
	        System.out.println(Arrays.toString(zeroAtTheEnd));
	        System.out.println(Arrays.toString(arr));
	        
//     Arrays.sort(arr);// moves zero to the front 
	        
//    System.out.println(Arrays.toString(arr));
		
	        index = 0;
	        
	        int startWithZero[] = new int[arr.length];
	        
	        for (int i = 0 ; i < arr.length ; i++) {
	            
	            if (arr[i] == 0) {
	                index++;
	            }
	            
	        }
	        
	        System.out.println("value of index "+index);
	        
	        for (int i = 0 ; i < arr.length ; i++) {
	            
	            if (arr[i] != 0) {
	                startWithZero[index] = arr[i];
	                index++;
	            }
	            
	        }
	        
	        
	        System.out.println(Arrays.toString(startWithZero));
	    }

		
		
		
		
		
		
	

}

