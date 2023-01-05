package day19_arrayreview;

import java.util.Arrays;
import java.util.Random;

public class ArrayWithRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[100];
		Random random = new Random();

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(numArr));

//one way to do it		

		// fill array of size 100 with random number between 1 and 100
		int[] randomArr = new int[100];
		Random rd = new Random(); // random max int value to min int value

		// random 0 to bound-1
//		        System.out.println(rd.nextInt(5)); // random 0 to 4
//		        System.out.println(rd.nextInt(5) + 1); // random 1 to 5
//		        System.out.println(rd.nextInt(101) + 50); // random 50 to 150
//		        System.out.println(rd.nextInt(51) + 50); // random 50 to 100

		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = rd.nextInt(100) + 1; // assign random 1 to 100 to each member
			System.out.println(randomArr[i]);
		}
	}

}
