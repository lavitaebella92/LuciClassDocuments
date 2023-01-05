package day26_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopingAnArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

//      System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
//          System.out.println(i);
			System.out.println(list.get(i));
		}

		for (Integer carlos : list) {
			System.out.println(carlos);
		}

		int index = 0;

		do {
			System.out.println(list.get(index));
			index++;
		} while (index < list.size());

		index = list.size() - 1;

		while (index >= 0) {
			System.out.println(list.get(index));
			index--;
		}

	}

}