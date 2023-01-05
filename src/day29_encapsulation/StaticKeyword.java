package day29_encapsulation;

import java.util.Arrays;

public class StaticKeyword {
    // below to the class not the instance
    
//    static variable
    static String name;
    static int age;
    
    //instance variable
    int num;
    double price;
    
    //Static method
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    // instance method
    public int getMaxValue(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    
    
    
}