package day15_stringtask;

public class CodingChallengeOreilly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int num = 30;
	        
	        for (int i = 1; i <= num; i++) {
	            
//	            System.out.println(i);
	            
	            if (i %4 == 0 && i % 7 == 0) {
	                System.out.println("Customer Service");
	            }else if (i % 4 == 0) {
	                System.out.println("Auto");
	            }else if (i % 7 == 0) {
	                System.out.println("Parts");
	            }else {
	                System.out.println(i);
	            }
	            
	            
	            
	        }
	        
		
		
		
		
		
		
	}

}
