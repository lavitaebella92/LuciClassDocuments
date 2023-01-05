package day19_arrayreview;

import java.util.Arrays;

public class ArrayUtilMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] letters = {'z', 'b', 'q', 'X'};
	    String[] colors = {"green", "blue", "yellow", "cyan", "brown","bobby","bible"};

	    // Sort array
	    Arrays.sort(letters);
	    Arrays.sort(colors);
	    System.out.println(Arrays.toString(letters));
	    System.out.println(Arrays.toString(colors));

	    // Fill array with specific value
	    int[] numArr = new int[100];
	    // i'd like to fill these arr with 100 value
	    Arrays.fill(numArr, 100);
	    System.out.println(Arrays.toString(numArr));

	    int numberToFill = 1;
	    for (int i = 0; i < numArr.length; i++) {
	      numArr[i] = numberToFill++;
	    }
	    System.out.println(Arrays.toString(numArr));
	    
	    
	    
		
		
	}

}
