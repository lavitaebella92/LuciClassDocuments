package day26_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Arrays.toString( )); Prints out all elements inside a string
		// elements inside a string look like this --> names [0] = "Brandon";
		// you cant create list of primitive type --> boolean, byte, char, double,
		// float, long, short, int
		// String is object type so we can add it.
		/*
		 * if you want to create list of primitive you add the object type its called
		 * autoboxing when you convert an object to primitive is called unboxing
		 * 
		 * 
		 */

		String names[] = new String[3];

		names[0] = "Brandon";
		names[1] = "Bahar";
		names[2] = "Hannah";

		System.out.println(names[0]);
		System.out.println(names[2]);

		System.out.println(names); // memory location // hashcode
		System.out.println(Arrays.toString(names));

//		        names[3] = "Elzat";
//		        System.out.println(Arrays.toString(names));

		// ArrayList<DataType> variableName = new ArrayList<>();

		ArrayList<String> list = new ArrayList<>();

		list.add("Brandon");
		list.add("Bahar");
		list.add("Hannah");
		list.add("Elzat");

		System.out.println(list);

		System.out.println(list.get(1));
		System.out.println(list.get(3));

		// you can't create list of primitive type --> boolean, byte, char, double ,
		// float, long, short, int

		int nums[] = { 1, 2, 3, 4 };

		ArrayList<Integer> numlist = new ArrayList<>();
//		        primitive          object
//		        byte               Byte
//		        char               Character
//		        short              Short
//		        int                Integer
//		        long               Long
//		        float              Float
//		        double             Double

		int value = 5;
		System.out.println(value);

		Integer val = value; // autoboxing

		System.out.println(val);

		// Autoboxing --> convert primitive to its object type
		// unboxing --> convert object type to primitive type

		/// Autoboxing
		char letter = 'A';
		Character objChar = letter;

		System.out.println(objChar);

		System.out.println(objChar.isLetter(letter));

		// unboxing
//		        object to primitive

		char digit = objChar;

		System.out.println(digit);

		char a = '7';
		char z = '?';

	}

}
