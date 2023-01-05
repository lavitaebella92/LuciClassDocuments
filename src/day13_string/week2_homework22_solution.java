package day13_string;

public class week2_homework22_solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "TechCircle";
	        
	        char input = str.charAt(0);
	        
	        if (input >= 'a' && input <= 'z') {
	            System.out.println(input +" is lowercase letter");
	        }else if (input >= 'A' && input <= 'Z') {
	            System.out.println(input +" is uppercase letter");
	        }else if (input >= '0' && input <= '9') {
	            System.out.println(input +" is digit");
	        }else {
	            System.out.println(input + " is a special character");
	        }
		
		
		
		
		
		
	}

}
