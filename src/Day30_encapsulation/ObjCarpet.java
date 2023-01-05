package Day30_encapsulation;

public class ObjCarpet {

	public static void main(String[] args) {

		
		   
		        Carpet c1 = new Carpet(4,7, 10, false);
		        System.out.println(c1.calcCost());
		        System.out.println(c1.toString());
		        
		        Carpet c2 = new Carpet(4,7, 10, true);
		        
		        System.out.println(c2.calcCost());
		        System.out.println(c2.toString());
		        
		        
		        Carpet c3 = new Carpet(-4,7, 10, true);
		        System.out.println(c3.calcCost());
		        System.out.println(c3.toString());

		        Carpet c4 = new Carpet(-4,7, 10, false);
		        System.out.println(c4.calcCost());
		        System.out.println(c4.toString());
		        
		        
		        Carpet c5 = new Carpet(4,-7, 10, true);
		        System.out.println(c5.calcCost());
		        System.out.println(c5.toString());

		    
		    }
		}
		
		