package day29_encapsulation;

public class ObjectStaticKeyword {

		
	// if its static you can call out the class, if not, you have to create the instance	
	//static  classname.  	
		
		 public static void main(String[] args) {
		        
		        
		        System.out.println(StaticKeyword.name);
		        System.out.println(        StaticKeyword.reverse("abc"));
		        
		        StaticKeyword kw = new StaticKeyword(); // default constructor
		        System.out.println(kw.num);
		        System.out.println(kw.price);
		        kw.getMaxValue(null);
		        

		        
		        
		    }
		}