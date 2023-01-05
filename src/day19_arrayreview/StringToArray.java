package day19_arrayreview;

import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String str = "Hello-World I'm learning Core-Java";

	    // .split()
	    String[] strArr = str.split("[-,' ]");
	    System.out.println(Arrays.toString(strArr));

	    // .toCharArray()
	    char[] chars = str.toCharArray();
	    System.out.println(Arrays.toString(chars));
		
		
		
		
		
		
		
		
	}

}
