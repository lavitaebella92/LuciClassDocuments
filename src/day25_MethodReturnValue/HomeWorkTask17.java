package day25_MethodReturnValue;

public class HomeWorkTask17 {

	public static void main(String[] args) {

		/*
		 * Write a program that can reverse the word of every second word of the
		 * sentence Example:
		 * 
		 * input: "I love Java so much more than Javascript"
		 * 
		 * output: "I evol Java os much erom than tpircsavaJ"
		 */

		String input = "I love Java so much more than Javascript";

		String arr[] = input.split(" ");

		String output = "";

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 1) {
//	                System.out.println(arr[i]);
				// System.out.println(reverse(arr[i]));
				output += reverse(arr[i]) + " ";
			} else {
				output += arr[i] + " ";
			}

		}

		System.out.println(output);

	}

	public static String reverse(String str) { // he created this method and the called it up there in the code
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

}