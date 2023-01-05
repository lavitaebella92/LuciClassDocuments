package Day30_encapsulation;

public class Circle {

	    
	    /*
	     * Task: create a custom class called Circle 
	     * private variables: radius, diameter, PI, area, 
	     * perimeter add a constructor to set all fields generate
	     * getter for all private fields 
	     * private methods: calculateArea, calculatePerimeter 
	     * public methods: toString
	     */

	    private int radius;
	    private int diameter;
	    private int pI;
	    private int area;
	    private int perimeter;
	    
	    public Circle() {}
	    
	    public Circle(int radius, int diameter, int pI, int area, int perimeter) {
	        
	        this.setRadius(radius);;
	        this.setDiameter(diameter);
	        this.setPI(pI);
	        this.setArea(area);;
	        this.setPerimeter(perimeter);;
	    }

	    public int getRadius() {
	        return radius;
	    }

	    public void setRadius(int radius) {
	        this.radius = radius;
	    }

	    public int getDiameter() {
	        return diameter;
	    }

	    public void setDiameter(int diameter) {
	        this.diameter = diameter;
	    }

	    public int getPI() {
	        return pI;
	    }

	    public void setPI(int pI) {
	        this.pI = pI;
	    }

	    public int getArea() {
	        return area;
	    }

	    public void setArea(int area) {
	        this.area = area;
	    }

	    public int getPerimeter() {
	        return perimeter;
	    }

	    public void setPerimeter(int perimeter) {
	        this.perimeter = perimeter;
	    }
	    
	    public int calculateArea(int area, int pI, int radius) {
	        area = pI * (radius^2);
	        return area;    
	    }
	    
	    public int calculatePerimeter(int perimeter, int pI, int radius) {
	        perimeter = 2 * pI * radius;
	        return perimeter;    
	    }

	    @Override
	    public String toString() {
	        return "Circle [radius=" + radius + ", diameter=" + diameter + ", pI=" + pI + ", area=" + area + ", perimeter="
	                + perimeter + "]";
	    }
	    
	}