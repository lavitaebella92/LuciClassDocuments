package day16_stringreview;

import java.awt.Point;

public class ReferenceVsPrimitive {

	public static void main(String[] args) {

		//Primitive is re assigning  a value to an int
		// Primitive
	    // Non-Primitive

	    int numA = 1;
	    int numB = numA; // numB == numA, numB == 1
	    numA = 2; // change numA
	    numA = 5;
	    System.out.println("numA = " + numA); // 5
	    System.out.println("numB = " + numB); // 1

	    //              @100 => x:1, y:1
	    Point pointA = new Point(1, 1); // pointA = x:1, y:1
	    //    @100   = @100
	    Point pointB = pointA; // pointB = x:1, y:1
	    //
	    pointA.x = 10;
	    pointA.y = 10; // pointA = x:2, y:10
	    System.out.println("pointA = " + pointA);
	    System.out.println("pointB = " + pointB);
	    
		
		
		
		
	}

}
