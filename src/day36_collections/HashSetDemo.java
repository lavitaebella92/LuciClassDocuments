package day36_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		// Set can only hold distinct value 
		
		ArrayList<Integer>nums =new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums.size());
		System.out.println(nums);
		
		Collection<Integer>list2=new ArrayList<>();
		list2.add(1);
		list2.addAll(Arrays.asList(2,3,2,1,2,3));
		
		System.out.println(list2.size());
		System.out.println(list2);
		
		List<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,1,2,3));
		
		System.out.println(list3.size());
		System.out.println(list3);
		
		System.out.println("----------------set------------");
		
		HashSet<Integer>set1=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.addAll(Arrays.asList(1,2,3));
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.addAll(Arrays.asList(1,2,3,3,4));
		
		System.out.println(set1.size());
		System.out.println(set1);
		
		/*"Apple" , "orange","Mango","Melon","Pear","Apple" , "orange","Mango","Melon","Pear"
		Create a hashSet to store the value below.
		print the size and each element*/
		
		
		  Collection<String> set2 = new HashSet<>();
	        set2.addAll(Arrays.asList("Apple" , "orange","Mango","Melon","Pear","Apple" , "orange","Mango","Melon","Pear"));
	        System.out.println(set2.size());
	        System.out.println(set2);
	        
	       // HashSet<String> set2 = new HashSet<>(Arrays.asList("Apple" , "orange","Mango","Melon","Pear","Apple" , "orange","Mango","Melon","Pear"));
	       // Set<String> set3 = new HashSet<>(Arrays.asList("Apple" , "orange","Mango","Melon","Pear","Apple" , "orange","Mango","Melon","Pear"));
	       // Collection<String> set4 = new HashSet<>();
	       // set4.addAll(set3);
	        
	        
	        
	        
	}

}
