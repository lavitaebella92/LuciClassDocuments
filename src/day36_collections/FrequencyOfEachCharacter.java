package day36_collections;

import java.util.HashSet;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		
		String str= "apple";
		
		//Write a program to print frequency of each character from as string 
		
//		input: apple
//		output:
//			a1
//			p2
//			l1
//			e1
//		
		
		String input = "apple";

		HashSet<Character> charSet = new HashSet<>();

		for (int i = 0; i < input.length(); i++) {

			charSet.add(input.charAt(i));

		}

		for (Character n : charSet) {
			int counter = 0;
			for (int i = 0; i < input.length(); i++) {

				if (n == input.charAt(i)) {
					counter++;
				}

			}

			System.out.println(n + ": " + counter);

		}


	}

}
