package day11_nestedloops;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner (System.in);
		
		System.out.println("How long do you want to wait?");
		
		int WaitTime = scan.nextInt();

		System.out.println(WaitTime + "timer starts!");
		
		
		
		for (int minute = WaitTime -1; minute>=0 ; minute--) {
//			System.out.println(minute);
		
		for (int second =59; second >=0; second--) {
//			System.out.println(second);
			System.out.println(minute+ "m " +second+ "s");
			Thread.sleep(1000);
		}
		}
		
		System.out.println("Time is up!!");
		scan.close();
		
	}

}
