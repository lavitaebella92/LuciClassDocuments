package day17_array;

import java.util.Arrays;

public class StringSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//you can split the array by anything
		
		
		
		String text="Java is fun"; // this is one string , the string is seperated by space // Java is fun
		
		System.out.println(text);
		
		String arr[] =text.split(" ");
		
		System.out.println(Arrays.toString(arr)); // [Java, is, fun]

		String arr2[]= text.split("a");
		
		System.out.println(Arrays.toString(arr2));//J, v,  is fun]
				
		
		  String str = "The defending champions are the French national football team, who defeated Croatia 4–2 in the 2018 FIFA World Cup final. The event is scheduled to take place under a reduced length, from 20 November to 18 December in Qatar. Being held in Qatar, it is the first World Cup tournament to be held in the Arab world.";
	        
	        String sentences[] = str.split("\\.");
	        
	        System.out.println(sentences.length);
	        
	        for(String sentence : sentences){
	            System.out.println(sentence);
	        }
		
		
		
		
	}

}
