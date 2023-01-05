package day25_MethodReturnValue;

public class ArrayHomework19 {

	 public static void main(String[] args) {
	        /*
	         * 19. Given name array. find all the palindrome string then put into a new array.
	            
	java
	            String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};
	            
	        */
	        
	        String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};
	        
	        for (String s : names ) {
//	            System.out.println(s);
//	            
//	            // reverse the string
//	            System.out.println(StringUtils.reverseAString(s));
	            
	        	
	        	// the code on top is to reverse it 
	        	
//	            this one to compare it with original string 
	            
	            if (s.equalsIgnoreCase(StringUtils.reverseAString(s))) { //need to put ignore case because java is sensitive
	                System.out.println(s);
	            }
	        }
	        
	        
	        
	    }
	}