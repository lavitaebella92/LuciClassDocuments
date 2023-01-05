package day35_exceptions;

public class ArrayIndexProblem {

	public static void main(String[] args) {
		
		String fruits[] = { "Apple", "Orange", "Banana" };

		try {
			for (int i = 0; i <= fruits.length; i++) {
				System.out.println(fruits[i]);
			}
		} catch (Exception e) {
			System.out.println("Exception handling code here");
			System.out.println("Array index issue");
			e.printStackTrace();

		}
		System.out.println("Line number 19");

	}

}
