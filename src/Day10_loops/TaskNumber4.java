package Day10_loops;

public class TaskNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a java program to print sum of even number between 1-100.
		
		
		int sum= 0;
		
		for (int i=1 ; i <=101 ; i++) {
			if (i% 2 ==0) {
			sum =sum +i;
			}
		}
			System.out.println(sum);
	}
		
}	
		



