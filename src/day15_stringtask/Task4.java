package day15_stringtask;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Your team has created a new bank website that requires email address to be
		 * validated. The email string must contain an '@' character. The email string
		 * must contain an '.' character. The '@' must contain at least one character in
		 * front of it. e.g. "a@example.com" is valid while "@example.com" is invalid.
		 * The '.' and '@' must be in the appropriate places. e.g. "mike.smith@com" is
		 * invalid while " mike.smith@example.com" is valid. For a given string, find a
		 * solution that writes true on the console if an email is valid and false if it
		 * is invalid.
		 * 
		 * Examples: str = "test@example.com" --> true 
		 *           str ="test@example.co.in --> true
		 *           str = "@example.com" --> false
		 * 
		 */
		
		 String email = "john.smith@gmail.com";
	        
	        boolean hasAt = false;
	        boolean hasDot  =false;
	        boolean hasCharacterBeforeAt = false;
	        boolean dotIsAfterAt = false;
	        
	        if (email.contains("@")) {
	            hasAt = true;
	        }
	        
	        if (email.contains(".")) {
	            hasDot = true;
	        }
	        
	        if (email.charAt(0) != '@') {
	            hasCharacterBeforeAt = true;
	        }
	        
	        if (email.lastIndexOf('.') > email.indexOf('@')) {
	            dotIsAfterAt = true;
	        }
	        
	        if (hasDot &&
	            hasAt &&
	            hasCharacterBeforeAt &&
	            dotIsAfterAt) {
	            System.out.println(true);
	        }else {
	            System.out.println(false);
	        }
	}
}