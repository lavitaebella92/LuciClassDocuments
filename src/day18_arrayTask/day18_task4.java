package day18_arrayTask;

import java.util.Arrays;
import java.util.Random;

public class day18_task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* write a program that can count the even and odd numbers from an array of integers
		 * Note: MUST use for each loop
		 */
		
		// dataType arrayName[] = new dataType[size];
		int nums[] = new int[10];

		Random random = new Random();

//        System.out.println(random.nextInt(100));
//        
//        
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < nums.length; i++) {
//            System.out.println(i);
			nums[i] = random.nextInt(15);
//            if (nums[i] == 0) {
//                nums[i] = random.nextInt(15);
//            }
//            if (nums[i] %2 == 0) {
//                evenCount ++;
//            }else {
//                oddCount++;
//            }
//            

		}

		for (int num : nums) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println(Arrays.toString(nums));

		System.out.println("Even number count :" + evenCount);

		System.out.println("Odd number count :" + oddCount);

	}

}
