package day05_operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  && AND (logical and) condition has to be true
		// || OR (logical or) one condition has to be true
		// ! (logical not) 
		
		
		int a = 1; 
		int b = 2;
		int c = 3;
		
		//in order to use && you must have 2 conditions
		
		boolean condition1 =true;
		boolean condition2 =false;
		boolean condition3 =true;
		
		System.out.println(condition1 && condition3); //true
		System.out.println(condition1 && condition2); //false
		System.out.println(condition1 && condition2 &&condition3); //false
		
		boolean condition4 = a + b == c;
		boolean condition5 = a * b > c;// false 
		
		boolean result = condition5 && condition4;
		
		System.out.println(result);
		
		
		/*
		 *
		
		//&& (AND)
		ConditionA conditionB Result
		true           true     true
		true           false    false
		false          true     false
		false          false    false  
		
		*/
		
		
		
		System.out.println (a > b && a < c); //false
		System.out.println(a < b && a < c); // true
		System.out.println(a < b && a < c && a*b < c); //true
		
		
		/*
		 || (OR)		
		 
		
		
		conditionA  conditionB Result 
		true         true       true 
		true         false      true
		false        true       true
		false        false      false 
		
		*/
		
		
		System.out.println(condition1 || condition2); //true
		System.out.println(condition1 || condition2 || condition3);  //true
		
		/*
		// ! ( Logical Not)
		
		ConditionA      ConditionB 
		   true            false
		!conditionA  =>     false
		!conditionB  =>     True
		
		*/
		
		System.out.println(condition1);
		System.out.println(!condition1);
		System.out.println(!condition2);   //true
		
		System.out.println("condition1= " + condition1);
		System.out.println(!condition1); //false
		System.out.println(!!condition1);// true 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
