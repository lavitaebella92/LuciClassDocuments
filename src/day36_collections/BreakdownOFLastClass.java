package day36_collections;

import java.util.HashSet;
import java.util.Set;

public class BreakdownOFLastClass {

	public static void main(String[] args) {
		  String str = "apple";
	        
//        Write a program to print frequency of each character from a string
//        input: apple
//        output:
//            a 1
//            p 2
//            l 1 
//            e 1
        
        Set<Character> myUniqueCharacters = new HashSet<>();
        
        for (char c : str.toCharArray()) {
            myUniqueCharacters.add(c);
        }
        
        System.out.println(myUniqueCharacters);
//        
//        
//        System.out.println(frquencyOfChar("apple",'p'));
        
        
        for (Character c : myUniqueCharacters) {
            System.out.println(c +" "+ frquencyOfChar(str, c) );
        }

        
    }
    
    
    public static int frquencyOfChar(String str, char targetChar) {
        
        int count = 0;
        
        for (char a : str.toCharArray()) {
            if (a == targetChar) {
                count++;
            }
        }
        
        
        return count;
    }
    
}