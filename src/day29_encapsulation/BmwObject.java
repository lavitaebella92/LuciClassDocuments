package day29_encapsulation;

	public class BmwObject {
	    public static void main(String[] args) {
	        
	        BMW x5 = new BMW();
	        
	        System.out.println(x5.brand);
	        System.out.println(x5.color);
	        System.out.println(x5.model);
	        
	        
	        BMW x1 = new BMW("X1"); 
	        
	        System.out.println(x1.brand);
	        System.out.println(x1.model);
	        
	        
	        BMW z4 = new BMW("z4","Red");
	        
	        System.out.println(z4.toString());
	        
	        
	        
	    }
	}