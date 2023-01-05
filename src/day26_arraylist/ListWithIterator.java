package day26_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ListWithIterator {

	public static void main(String[] args) {
		/*
		 * When you type an Iterator:
		 * Iterator <String> i =names.iterator();
		 * 					 i is variable name
		 * 					names: is the list name in this sample
		 * 
		 */
		
		
		   ArrayList<String> names = new ArrayList<>();
	        names.add("Nesirdin");
	        names.add("Ali");
	        names.add("Roman");
	        
	        // iterator
	        Iterator<String> nazanin = names.iterator();
	        
	        // hasNext -> return boolean
//	                      true if we have next element
//	                      false if we don't have next element
	        
	        // next --> move to next element
	        
//	        System.out.println(nazanin.hasNext());
//	        
//	        System.out.println(nazanin.next());
//	        
//	        System.out.println(nazanin.next());
//	        
//	        
//	        System.out.println(nazanin.hasNext());
//	        System.out.println(nazanin.next());
//	        
//	        System.out.println(nazanin.hasNext());
	        
	        
	        while(nazanin.hasNext()) {
	            System.out.println(nazanin.next());
	        }
	        
	        
		
		
		
		
		
		

	}

}
