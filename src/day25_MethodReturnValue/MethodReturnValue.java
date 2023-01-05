package day25_MethodReturnValue;

public class MethodReturnValue {

	 public static void main(String[] args) {
	        
	        
	        int a = 1;
	        int b = 2;
	        int result = a + b;
	        System.out.println(result + 10);

	        System.out.println(sumOfTwoValue(10, 20));
	        
	        int c = 9; 
	        int d = 20;
	        
	        int result2 = sumOfTwoValue(a, b) + sumOfTwoValue(7 , 90);
	        
	        
	        System.out.println(result2);
	        
	        
	        String num = sumOfTwoValue(1.9, 2.5);
	        
	        System.out.println(num); // 4.4
	        System.out.println(num.charAt(1));
	        
	        
	    }
	    
	    // Method overloading
	    // having more than one method with same name and different parameter in the same class
	    public static int sumOfTwoValue(int a, int b) {
	        return a + b;
	    }
	    
	    public static String sumOfTwoValue(double a , double b) {
	        double result = a + b;
	        
	        return Double.toString(result);
	    }
	    
	    
	    
	    

	}