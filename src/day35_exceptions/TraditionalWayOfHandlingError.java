package day35_exceptions;

public class TraditionalWayOfHandlingError {

public static void main(String[] args) {
		
	int a, b;
	a = 7;
	b = 0;

	if (b != 0) {
		System.out.println("Result : " + a / b);
	} else {
		System.out.println("b is zero");
	}
	System.out.println("program is completed");
	
	

	int[] nums = { 1, 2, 3, 4, 5 };

	if (nums.length > 5) {
		System.out.println(nums[5]);
	}

	System.out.println("program is completed");

	
	
	
	String str= null;
	if (str!=null) {
		System.out.println(str.charAt(0));
	}
	}

}

