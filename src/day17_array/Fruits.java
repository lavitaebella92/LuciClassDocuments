package day17_array;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

						//  0           1         2        3         4
		String fruits[] = {"pinapple", "apple","kiwis", "orange", "mango"};
		
		for (int i = 0; i < 5; i++) {
			System.out.println(fruits[i].toUpperCase());
		}

		// 0 1 2 3 4
		int nums[] = { 1, 2, 30, 4, 6 };

		int max = nums[0];

		for (int i = 0; i < 5; i++) {
			// System.out.println(nums[i]); //6

			if (nums[i] > max) {
				max = nums[i];
			}

		}

		System.out.println(max);
	}
}
        
//        
//        int a = 4;
//        int b = 20;
//        int max =2;
//        
//        if (a > max) {
//            max = a;
//        }
//        
//        if (b > max) {
//            max = b;
//        }
//        
//        System.out.println(max);