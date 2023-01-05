package day20_morearray;

import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * What's an array? object collection of data that has same type, fixed size,
		 * index starts at 0.
		 * 
		 */

		String names[] = new String[5]; // this is assigning the elements --> 5

		// reading data from names array

		System.out.println(names[0]); // reads first element of string array is null because we havent assign the
										// value

		// Assigning value to names array
		names[0] = "Hannah";

		names[4] = "Elzat";

		System.out.println(names[0]); // now it will display Hannah

		// element count
		System.out.println(names.length);// return number of elements of this array =5

		// Displaying all the value from names array as a string

		System.out.println(Arrays.toString(names)); // import it to java.util , it will print [Hannah, null,null, null,
													// Elzat]

		// When you dont need the index position , if you only want to access each
		// element of your array
		// use for each loop.
		// Syntax of for each loop
		// for (dataType) yourVariableName: NameOfyourArray){ // data type ( string,
		// int,...)
//		your statement
		// }

		for (String n : names) {
			System.out.println(n); // n is each element of my names array.
			// display if the element is not equals to null
//		if (!n.equals(null)) { 
//			System.out.println(n);  this one doesnt work 
//		}
			if (n != null) {
				System.out.println(n);
			}
		}
			// if you need index position of the array use for loop

			for (int i=0; i<names.length; i++) {
			// i means index position of the names array
//			System.out.println(i);  prints all the index of the names array: 0,1,2,3,4
			// read value from names array
//		System.out.println(names[i]);  names [0], names [1], names [2], names [3], names [4], 
		}

		// which index position has null value

	//	if (names[i]== null){
		//	System.out.println(i); // will print 1 2 3 because they are null 
		
	}

	}

	

