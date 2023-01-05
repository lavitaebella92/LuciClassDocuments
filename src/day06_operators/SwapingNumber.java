package day06_operators;

public class SwapingNumber {

	public static void main(String[] args) {

		int a =1; 
		int b =2;
		int temp = a;
		
		
		System.out.println("value of a is" +a);
		System.out.println("value of a is" +b);
		
		
		a = b;
		b = temp;
		
	
		System.out.println("value of a is" +a);
		System.out.println("value of a is" +b);

		
		int c =10;
		int d =2;
		
        c= c + d - c;
        d = d + d + d+ d + d;
        
	
		
		System.out.println("value of c is"+c);
		System.out.println("value of d is" +d);
		
	//	output : c =2
			//	d = 10
	
		c = c + d; // 10 +2 =12
		System.out.println(c);	
		d = c -d ; //12 -2
		
		
		
		
		
		
		
		
	}

}
