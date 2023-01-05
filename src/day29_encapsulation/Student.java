package day29_encapsulation;

public class Student {

	
		/* Instance Variable
		 * 
		 * Source/generate to string/  = creates concagnation
		 */
		
		   // instance variable
	    String name;
	    int age;
	    char gender;
	    
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name1) {
	        name =  name1;
	        
	    }


	    public String toString() {
	        return "Student {name=" + name + ", age=" + age + ", gender=" + gender + "}";
	    }
	    
	    
	    
	    
	    
	    
	}