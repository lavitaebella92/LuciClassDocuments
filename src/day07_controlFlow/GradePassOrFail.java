package day07_controlFlow;

public class GradePassOrFail {

	public static void main(String[] args) {
		//char is the variable 
		char grade = 'D';		
		
		switch(grade) {
		case 'A':
			break;
		case 'B':
			break;
		case 'C':	
			break;
		case 'D':
			System.out.println("Pass");
			break;
		case 'W':	
			System.out.println("Withdrawn");
			break;
		case 'I':	
			System.out.println("Incomplete");
			break;
		default:	
			System.out.println("Fail");
		}
			
			
					
		}
		
		
		
		
		
		
		
		
		
		
	}


