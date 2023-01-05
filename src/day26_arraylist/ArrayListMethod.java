package day26_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		// add --->adding element
		list.add("Rimer");
		list.add("Carlos");
		list.add("Azarias");
		list.add("Gigi");
		list.add("Karen");
		list.add("Elzat");

		// get (index) ---> reading value
		System.out.println(list.get(0)); // Rimer
		System.out.println(list.get(2));// Azarias

		// set --> updating the value

		list.set(1, "Bahar");
		System.out.println(list.get(1));
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		list.remove("Elzat");
		System.out.println(list);

		System.out.println(list.size()); // number of elements

		list.clear();
		System.out.println(list); // clears it

		ArrayList<Integer> listA = new ArrayList<>();
		listA.add(1);
		listA.add(2);
		listA.add(3);

		ArrayList<Integer> listB = new ArrayList<>();
		listB.add(4);
		listB.add(5);
		listB.add(6);

		listB.addAll(listA);

		System.out.println(listB);

		Collections.sort(listB);

		System.out.println(listB);

		System.out.println(listA);

		ArrayList<Double> prices = new ArrayList<>(Arrays.asList(1.99, 2.99, 5.0, 7.0, 8.9, 9.9));

		System.out.println(prices.size());
		System.out.println(prices);

		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "orange", "grapes"));

		System.out.println(fruits);

	}
}