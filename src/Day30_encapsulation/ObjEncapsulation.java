package Day30_encapsulation;

public class ObjEncapsulation {

	

	    public static void main(String[] args) {
	        Encapsulation_demo ed = new Encapsulation_demo(); // class instantiation. 
	                                                          // created instance of Encapsulation_demo by 
	                                                          // calling default constructor Encapsulation_demo class
	        System.out.println(ed.getName()); // null
	        ed.setName("Carlito");
	        
	        System.out.println(ed.getName());
	        
	    }

	}