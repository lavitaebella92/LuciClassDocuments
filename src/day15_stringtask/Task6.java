package day15_stringtask;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*write a program that can return the initials of the user

				ex: techcircle school

				output: T.S

				Note: Pay attention to the example output*/
		
		
		  String str = "techcircle school";
          
	        str = str.toUpperCase();
//	        System.out.println(str);   
//	        
//	        System.out.println(str.lastIndexOf(' ')); //17
//	        
//	        System.out.println(str.charAt(18));
//	                         
//	        System.out.println(str.charAt(str.lastIndexOf(' ') +1));              
	                         
	        String initials = ""+str.charAt(0)+"."+str.charAt(str.lastIndexOf(' ') +1);
	        System.out.println(initials);
		
		
		
		
		
		
		
	}

}
