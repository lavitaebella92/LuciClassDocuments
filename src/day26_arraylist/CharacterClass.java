package day26_arraylist;

public class CharacterClass {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
		String str = "abc123!@#!ABC@09809809#";

		for (int i = 0; i < str.length(); i++) {

			// System.out.println(str.charAt(i));

//	            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ||
//	                    str.charAt(i) >= 'A' && str.charAt(i)<= 'Z') {
//	                System.out.println(str.charAt(i));
//	            }

//	            if (Character.isLetter(str.charAt(i))) {
//	                System.out.println(str.charAt(i));
//	            }

//	            if (Character.isDigit(str.charAt(i))) {
//	                System.out.println(str.charAt(i));
//	            }
			char currentChar = str.charAt(i);

			if (!Character.isLetter(currentChar) && !Character.isDigit(currentChar)) {
				System.out.println(currentChar);
			}

		}

		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('r'));

		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('9'));

		String str2 = "true";

		if (Boolean.parseBoolean(str2)) {
			System.out.println("Hello Carlos");
		}

	}

}
