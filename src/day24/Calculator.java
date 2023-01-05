package day24;

public class Calculator {

	// create a method that can add 2 values
    public static void adding2Numbers(int a, int b) {
//      int a = 4;
//      int b = 8;
      System.out.println(a + b);

  }

  // create a method that can add 3 int value.

  public static void main(String[] args) {
      adding2Numbers(3, 9); // this is how we call out the methods 

      adding2Numbers(30, 9);

      adding3Numbers(1, 2, 3);
      
      
      
      sub2numbers(5,3);
      sub2numbers(5,-3);
      
      multi2numbers(5,3);
      
      div2numbers(14,7);
      
      // one function  to do all the operators
      calculator("+",10,5);
      calculator("-",10,5);
      calculator("*",10,5);
      calculator("/",10,5);
      
      // below is the way we code so we can call out the methods
      
  }

  public static void adding3Numbers(int x, int y, int z) {
      System.out.println(x + y + z);
  }

  public static void sub2numbers(int a, int b) {

      System.out.println(a - b);

  }

  public static void multi2numbers(int a, int b) {

      System.out.println(a * b);

  }

  public static void div2numbers(int a, int b) {

      System.out.println(a / b);

  }
  
  public static void calculator(String operator , int a , int b) {
      
      if (operator.equals("+")) {
          adding2Numbers(a , b);
      }else if (operator.equals("-")) {
          sub2numbers(a, b);
      }else if (operator.equals("*")) {
          multi2numbers(a, b);
          
      }else {
          div2numbers(a, b);
      }
      
      
      
  }
  
  
  
  
  
  
  
  
  
  
  

}