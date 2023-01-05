package day17_array;

import java.util.Arrays;

public class ArraysEqualMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums1 []= {1,2,3,4};
		
		int nums2[]= {4,2,3,1};
		
		int nums3[]= {1,2,3};
		
		System.out.println(Arrays.equals(nums1, nums2)); // false because its not sorted
		
		
		System.out.println(Arrays.equals(nums1, nums3));
		
		Arrays.sort(nums2);
		System.out.println(Arrays.equals(nums1, nums2)); // true after sorted 
		
		// good thumb of rule is to sort array first and then compare, make sure you use equal message 
		
	
		
	}

}
