package day14_subString;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Must contain: 8-20 characters And 2 of the following: Lowercase Uppercase
		 * Numbers Special characters, except < >
		 */

		String password = "Hello123>";
		// String invalidPassword = "hello"; //"hello123!", //"Hello123>", //"Hello123<"
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;

//	    8-20 characters
		if (password.length() >= 8 && password.length() <= 20) {
//	        And 2 of the following:
//	        Lowercase 
//	        Uppercase 
//	        Numbers
//	        Special characters, except < >

			for (int i = 0; i < password.length(); i++) {
				// System.out.println(password.charAt(i));
				char input = password.charAt(i);
				if (input >= 'a' && input <= 'z') {
					// System.out.println(input +" is lowercase letter");
					hasLowerCase = true;
				} else if (input >= 'A' && input <= 'Z') {
					// System.out.println(input +" is uppercase letter");
					hasUpperCase = true;
				} else if (input >= '0' && input <= '9') {
					// System.out.println(input +" is digit");
					hasDigit = true;
				} else {
					System.out.println(input + " is a special character");

//	                if (input != '>' || input != '<') {
//	                    hasSpecialChar = true;
//	                }

					if (!password.contains(">") && !password.contains("<")) {
						hasSpecialChar = true;
					}

				}

			}

		}

		boolean isValidPassword = hasLowerCase && hasDigit && hasUpperCase && hasSpecialChar;

		if (isValidPassword) {
			System.out.println(password + " is a valid password");
		} else {
			System.out.println(password + " is an Invalid password, please try again.");
		}
	}


	}


