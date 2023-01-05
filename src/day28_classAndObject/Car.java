package day28_classAndObject;

public class Car {

//template /or blueprint Car ^ class is our blueprint 
	
	
	    //Class − A class can be defined as a template/blueprint that describes 
	    //the behavior/state that the object of its type support. 
	    
	    //instance variables --> variable that declared inside of the class and outside of the method.
	    String brand;
	    String model;
	    String color;
	    int year;
	    double price;
	    
	    public void SetInfo(String b, String m, String c, int y, double p ) {
	    	brand =b;
	    	model=m;
	    	color=c;
	    	year=y;
	    	price=p;
	    }
	    
	    
	    
	    
	    
	    
	    
	    // instance method
	    public void drive() {
	        System.out.println("Driving "+ brand +" "+ model);
	    }
	    
	    
	    public void start() {
	        System.out.println(brand +" "+ model +" has started");
	    }
	    
	    public void stop() {
	        System.out.println(brand +" "+ model +" has stopped");
	    }
	}
