package day29_encapsulation;


	//constructors are method modifiers 
	
	public class BMW {
	    String brand;
	    String model;
	    String color;
	    
	    // No argument constractor
	    public BMW() {
	        brand = "BMW";
	    }
	    
	    public BMW(String model1  ) {
	        brand = "BMW";
	        model = model1;
	    }
	    
	    public BMW(String model1 , String color1  ) {
	        brand = "BMW";
	        model = model1;
	        color = color1;
	    }
	    
	    
	    public BMW(String brand1, String model1 , String color1  ) {
	        brand = brand1;
	        model = model1;
	        color = color1;
	    }

	    @Override
	    public String toString() {
	        return "BMW [brand=" + brand + ", model=" + model + ", color=" + color + "]";
	    }
	    
	    
	    
	    
	}
