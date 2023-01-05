package day05_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// +, -, *, /, %, ++, --
		
		int a = 10;
		int b = 2;
		int c = 3;
		
//addition	10 +2 
		System.out.println(a+b); //12
		System.out.println(a+b+c); //15
		
		System.out.println(a - b -c); //5
		
		System.out.println(a * b); //20
		
		System.out.println(a/b); //5 
		
		System.out.println(a/c); //3
		
		System.out.println(10/11);		
		
		System.out.println(1/2);		
		
		
		double d1 =1;
		double d2=2;
		
		System.out.println(d1/d2); //0.5
		
		System.out.println(10/3.0); // this is just an example not encouraged
		
		//Modules  % left hand operator  % by right hand 
		
		int A = 10;
		int B = 3;
		int C =5;
		
		// 10 % 3 ==> (3 +3 +3 +1)
		
		System.out.println(a % b);
		System.out.println(10 % 4);  // 4 +4 +2 
		System.out.println(A % C);  //remainder is 0
		
		System.out.println(3%2); //1
		System.out.println(4%2); //0
		System.out.println(5%2); //1
		System.out.println(100%2); //0
		System.out.println(10001 %2); //1
		
		System.out.println(80%2); //0
		System.out.println(85 %2); //1
		
		// increment ++
		int count = 1;
		
		count = count +1;
		
		System.out.println(count); //2
		
		count++; // count = count +1 
		System.out.println(count); //3
		
		count++;
		System.out.println(count);
		count++;
		System.out.println(count);
		count++;
		System.out.println(count);
		count++;
		System.out.println(count); //7
		
		
		count++;
		count++;		
		count++;
		System.out.println(count); //10
		
		
		
		
		//decrement 
		// 10 -1
		count = count -1;
		//count --;
		System.out.println(count); //9
		
		count--;
		System.out.println(count); //8
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
