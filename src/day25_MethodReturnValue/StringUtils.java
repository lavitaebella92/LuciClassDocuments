package day25_MethodReturnValue;

public class StringUtils {

	public static void main(String[] args) {
		System.out.println(reverseAString("apple"));
		System.out.println(reverseAString("java"));

		String emails[] = { "test@gmail.com", "test@walmart.com", "test@aws.com", "test@yahoo.com", "test@google.com",
				"test@techcircle.com" };

		for (String email : emails) {
			System.out.println(getDomainName(email));
		}

		System.out.println(isValidPassword("passWord123!"));
		System.out.println(isValidPassword("passord123!"));

	}

	// get domain name
	public static String getDomainName(String email) {
//        012345678910
//String email = "test@gmail.com";

//System.out.println(email.indexOf('@')); // 
//System.out.println(email.lastIndexOf('.'));

		String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));

//System.out.println(domain);

		return domain;

	}

	// reverse a string

	public static String reverseAString(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		return reverse;
	}
	// get domain name from an email
	// test@gmail.com , test@docker.com , test @walmart.com

	/*
	 * Password validation Must contain: 8-20 characters And 2 of the following:
	 * Lowercase Uppercase Numbers Special characters, except < >
	 * 
	 */

	public static boolean isValidPassword(String password) {

		// String password = "Password123!";
		// String invalidPassword = "hello"; //"hello123!", //"Hello123>", //"Hello123<"
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;

		// 8-20 characters
		if (password.length() >= 8 && password.length() <= 20) {
			// And 2 of the following:
			// Lowercase
			// Uppercase
			// Numbers
			// Special characters, except < >

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

					if (!password.contains(">") && !password.contains("<")) {
						hasSpecialChar = true;
					}

				}

			}

		}

		boolean isValid = hasLowerCase && hasDigit && hasUpperCase && hasSpecialChar;

		if (isValid) {
			System.out.println(password + " is a valid password");
		} else {
			System.out.println(password + " is an Invalid password, please try again.");
		}

		return isValid;
	}

}