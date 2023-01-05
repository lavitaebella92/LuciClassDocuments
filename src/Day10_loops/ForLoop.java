package Day10_loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		syntax:
//			for (CreateVariable : condition; increment or decrement) {
//				codeblock
//			}
//		
//		
		
		
		for (int i =1; i<=10; i++) {
			System.out.println(i); // prints 1-10 for code blocks ( variable i)

		}
		
		
		for (int i=100; i<201 ; i++ ) {
			System.out.println(i);
		}
		
		
		for (int i=100; i<201 ; i++ ) {
			System.out.print(i + " love ice cream "); // prints in one line
		}
		
		for (int i=100; i<201 ; i++ ) {
			System.out.print(i + " love ice cream ");
			if (i % 10 ==0) { // condition is false
				System.out.println();
			}
		}
		
		// to print even numbers 1-50
		
		for (int i=1; i <=50 ; i++ ) {
			if (i % 2 ==0) { 
			System.out.println(i); 
			}
}
	
}
	
}
		


