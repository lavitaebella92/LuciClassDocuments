package day18_arrayTask;

public class day18_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Create an array named classmates, and store 10 of your classmates' full names
		            print the initials of each classmates in separate lines
		 */
//						//		0			1				2				3				4			5				6	
//		String classmates ="Lucia Lazo, Rimer Torrico, Carlos Martinez, Karen Mendez, Jonthan Lazo, Bella Ella, Jimmy Neutron, Reina Ramirez, Mehak Deet, Ali Moor";
//
//		String arr[] = classmates.split(",");
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
//		System.out.println(arr[9]);
	
		
        //need to finish

		//below is the code teacher showed
		
		String[] names = { "Zolboo Enkhbayar", "Nesirdin Hesen", "Brandon Flores", "Kimberly Sristienvong",
				"Nazanin Gerami", "Roman Panas", "Ablimit Adil", "Maharem Jeroff", "Abhijay Kilkarni",
				"Zolboo Badralt John" };

//		System.out.println(names.length);

		System.out.println(names[0]);
		System.out.println(names[9]);
		System.out.println(names[names.length - 1]);

		for (int i = 0; i < names.length; i++) {
//	             System.out.println(i);
//	             System.out.println(names[i]);
			String name = names[i];

//	             System.out.println(name.charAt(0));

			String arr[] = name.split(" ");

			System.out.print(arr[0].charAt(0));
//	             System.out.print(arr[1].charAt(0));
			System.out.println(arr[arr.length - 1].charAt(0));

		}

	}
}
