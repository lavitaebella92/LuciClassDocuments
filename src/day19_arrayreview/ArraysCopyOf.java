package day19_arrayreview;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrA = {1, 2, 3, 4};
	    int[] arrB = arrA;
	    arrA[0] = 100;

	    System.out.println(Arrays.toString(arrA));
	    System.out.println(Arrays.toString(arrB));

	    System.out.println(arrA);

	    // .copyOf()
	    int[] arrC = Arrays.copyOf(arrA, 2);
	    arrA[1] = -333;

	    System.out.println(Arrays.toString(arrA));
	    System.out.println(Arrays.toString(arrC));
	    
	    // you can also use .copyOfRange() to limit the start and to index to copy
		
		
		
		
		
		
		
		
		
	}

}
