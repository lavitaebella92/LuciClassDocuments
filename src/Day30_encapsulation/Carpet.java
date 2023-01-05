package Day30_encapsulation;

public class Carpet {


// one way to do its
//	// private variables
//	   private int width;
//	    private int length;
//	    private double unitPrice;
//	    private boolean isPersian;
//
//	    public Carpet() {}
//	    
//	    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
//	        this.width = width;
//	        this.length = length;
//	        this.unitPrice = unitPrice;
//	        this.isPersian = isPersian;
//	    }
//	    
//	    public int getWidth() {
//	        if (this.width <= 0) {
//	            width = 0;
//	        }
//	        return width;
//	    }
//	   // Encapsulate all the fields:
//	    public void setWidth(int width) {
//	        this.width = width;
//	    }
//
//	    public int getLength() {
//	        return length;
//	    }
//
//	    public void setLength(int length) {
//	        this.length = length;
//	    }
//
//	    public double getUnitPrice() {
//	        if (this.unitPrice <= 0) {
//	            unitPrice = 0;
//	        }
//	        return unitPrice;
//	    }
//
//	    public void setUnitPrice(double unitPrice) {
//	        this.unitPrice = unitPrice;
//	    }
//
//	    public boolean isPersian() {
//	        return isPersian;
//	    }
//
//	    public void setPersian(boolean isPersian) {
//	        this.isPersian = isPersian;
//	    }
//	    
//	    public double calcCost(int width, int length, double unitPrice, boolean isPersian) {
//	        double totalCost = width * length * unitPrice;
//	        if (isPersian == true) totalCost += 200;
//	        return totalCost;
//	    }
//
//	    @Override
//	    public String toString() {
//	        return "Carpet [width=" + width + ", length=" + length + ", unitPrice=" + unitPrice + ", isPersian=" + isPersian
//	                + "]";
//	    }
//	}
	
	

//	    create a class named Carpet:
	//  private variables:
//	          width, length, unitPrice, isPersian (boolean)
	//
	//  Encapsulate all the fields:
//	          Conditions:
//	              width can not be negative
//	              unit price can not be negative
	//
	//Add a constructor to set all the instances
	//  instance methods:
//	          calcCost(): should be able to calculate the total cost of the carpet 
	//and return it as double
//	          toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

	//total price of carpet = (width*length)*unitPrice
	//if the carpet is persian  carpet, add 200$ to the totalPrice
	//

	//  private variables:
	//  width, length, unitPrice, isPersian (boolean)
	    private double width, length, unitPrice;
	    private boolean isPersian;
	    
	    

	    public Carpet(double width, double length, double unitPrice, boolean isPersian) {

	        //this.width = width;
	        setWidth(width);
	        //this.length = length;
	        setLength(length);
	        //this.unitPrice = unitPrice;
	        setUnitPrice(unitPrice);
	        this.isPersian = isPersian;
	    }

	    public double getWidth() {
	        return width;
	    }

	    public void setWidth(double width) {
	        if (width > 0) {
	            this.width = width;
	        } 
	    }

	    public double getLength() {
	        return length;
	    }

	    public void setLength(double length) {
	        if (length > 0) {
	            this.length = length;
	        }
	        
	    }

	    public double getUnitPrice() {
	        return unitPrice;
	    }

	    public void setUnitPrice(double unitPrice) {
	        if (unitPrice > 0) {
	            this.unitPrice = unitPrice;
	        }
	        
	    }


	    public boolean isPersian() {
	        return isPersian;
	    }

	    public void setPersian(boolean isPersian) {
	        this.isPersian = isPersian;
	    }
	    
	    
	    
	    //Add a constructor to set all the instances
	//  instance methods:
//	          calcCost(): should be able to calculate the total cost of the carpet 
	//and return it as double
	    
	    public double calcCost() {
	        //(width*length)*unitPrice
	        
	        
	        
	        double cost = width * length * unitPrice;
	        
	        if (isPersian && width != 0 && length != 0 && unitPrice != 0) {
	            cost += 200;
	        }
	        
	        
	        return cost;
	    }

	    @Override
	    public String toString() {
	        return "Carpet [width=" + width + ", length=" + length + ", unitPrice=" + unitPrice 
	                + ", isPersian=" + isPersian + ", cost=" + calcCost()  +"]";
	    }
	    
	    
	    
	    
	    
	    
	    
//	          toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

	//total price of carpet = (width*length)*unitPrice
	//if the carpet is persian  carpet, add 200$ to the totalPrice
	//
	    
	    

	}