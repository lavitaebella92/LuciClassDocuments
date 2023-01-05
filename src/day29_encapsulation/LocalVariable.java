package day29_encapsulation;

public class LocalVariable {



	/*num 4 is local variable only accessible in code block // anything inside the method is only accessible inside code block
	 * if you want to run a piece of code you have to call it from the main method
	 * 
	 * 
	 */
		public static void main(String[] args) {
		        int num = 4;
		        
		        printMaxValue();
		        
		        
		        for (int i = 5; i >= 0 ; i--) {
		            System.out.println(i);
		        }
		        
//		        for (int i = 5; i >= 0 ; i--) {
//		            System.out.println(i);
//		        }
//		        
//		        for (int i = 5; i >= 0 ; i--) {
//		            System.out.println(i);
//		        }
//		        
//		        for (int i = 5; i >= 0 ; i--) {
//		            System.out.println(i);
//		        }
		        
		        
		        
		    }
		    
		    public static void printMaxValue() {
		        int num = 6;
		        int num2 = 2;
		        
		        int max = num > num2 ? num : num2;
		        
		        System.out.println(max);
		        
		    }
		    
		    
		    
		    
		    
		}