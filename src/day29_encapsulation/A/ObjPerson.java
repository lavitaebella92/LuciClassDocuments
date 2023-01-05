package day29_encapsulation.A;



	public class ObjPerson {
	    public static void main(String[] args) {
	        
	        Person p = new Person();
	        
	        System.out.println(p.name); // default
	        
//	        System.out.println(p.dob); // private
	        
	        System.out.println(p.phoneNumber);// public
	        
	        p.sayHello();
	        p.thisIsPublicMethod();
	        
	        
	    }
	}