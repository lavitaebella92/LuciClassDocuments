package day36_collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// key , value
		Map<String, Integer> contacts= new HashMap<>();		
		// for map use .put not .add
		
		contacts.put("Alex", 1231231234); // adding value to map
		contacts.put("Juret", 1231231234);
		contacts.put("Alex", 1231231234);
		contacts.put("Juret", 323423424);
		
		
		System.out.println(contacts.size()); //2
		System.out.println(contacts.get("Juret")); // reading value from a map
		System.out.println(contacts.get("Alex"));
		System.out.println("-----------------");

		System.out.println(contacts.containsKey("Roman")); //false 
		System.out.println(contacts.containsKey("Juret")); //true 
		
		contacts.clear(); 
		System.out.println(contacts.size());// displays0

		contacts.put("Alex", 1231231234); // adding value to map
		contacts.put("Juret", 1231231234);
		System.out.println(contacts); 
		
		contacts.put("Alex", 1234399438); // updates alex phone number
		System.out.println(contacts); 

		
	}

}
