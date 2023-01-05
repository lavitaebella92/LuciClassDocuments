package day32_inheratance;

public class BookStore {

	
			public static void main(String[] args) {
				
				AudioBook The10XRule = new AudioBook("The 10X Rule","Grant Cardone", 15.54, "6.5","Rimer");
				
				System.out.println(The10XRule.toString());
				
				The10XRule.listen();
				
				System.out.println(The10XRule.type);
				
				EBook atomicHabits =new EBook("Atomic Habits", "James clear", 12.99, "45mb",450);

				atomicHabits.read();
				
				System.out.println(atomicHabits.toString());

				
			}

		}
	
		
		
	