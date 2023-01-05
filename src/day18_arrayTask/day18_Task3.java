package day18_arrayTask;

import java.util.Arrays;

public class day18_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Write a program that sort the array of integer in descending order*/
		
//		int nums[] = { 1, 24, 33, 4, 5 };
//
//		System.out.println(Arrays.toString(nums));
//
//		Arrays.sort(nums);
//
//		System.out.println(Arrays.toString(nums));
//
//
//		for (int i = nums.length - 1; i >= 0; i--) {
//			System.out.print(nums[i]);
//		}
		
		// teachers example below

		int arr[] = { 1, 24, 33, 4, 5 };

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

//        [1, 4, 5, 24, 33]
//         33. 24 , 5, 4, 1

		int outputArr[] = new int[arr.length];

//        System.out.println(arr.length);
//        System.out.println(outputArr.length);
//        
//        System.out.println(Arrays.toString(arr));
//        
//        outputArr[0] = arr[4];
//        outputArr[1] = arr[3];
//        outputArr[2] = arr[2];
//        outputArr[3] = arr[1];
//        outputArr[4] = arr[0];
//        System.out.println(Arrays.toString(outputArr));

		int index = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			// System.out.println(i);
//            System.out.println(arr[i]);

			outputArr[index] = arr[i];
			index++;
		}

		System.out.println(Arrays.toString(outputArr));
		
		

	}

}
