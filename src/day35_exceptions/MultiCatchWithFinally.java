package day35_exceptions;

public class MultiCatchWithFinally {

	    public static void main(String[] args) {
	        
	        String arr[] = {"Apple","pear","Orange", "grapes","mango", "Banana",null};
	        
	        try {
	            for (int i = 0 ; i <= arr.length ; i++) {
	                System.out.println(arr[i]);
	                
	                //StringIndexOutOfBoundsException
	                System.out.println(arr[i].charAt(arr[i].length()-1));
	                
	                //NullPointerException
	                System.out.println(arr[i].length());
	                
	                //ArrayIndexOutOfBoundsException
	                
	            }
	        }catch(StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException");
	        
	        }catch(ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException");
	            
	        }catch(Throwable e){
	            System.out.println("Throwable");
	        }finally {
	            System.out.println("Finally block");
	        }
	        
	        System.out.println("Program is completed");
	        

	    }

	}