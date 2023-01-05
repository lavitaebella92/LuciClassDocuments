package day32_inheratance;

public class AudioBook extends Book{
//AudioBook is a subclass of Book
	//it inhertitance all the variables, methods.
	
	// this way AudioBook becomes Subclass of Book
	//instance variables
		String duration;
		String narrator;
		
		public AudioBook () {}
		public AudioBook (String title  , String author, double price, String duration, String narrator) {
//			super.title = title;
//			super.type = type;
			// super has to be line number one of its constructor
			super(title,"AudioBook",author,price); // calling parameterized constructor of the Book class
			this.duration = duration; 
			this.narrator = narrator;
		}
		
		
		// method for audiobook
		public void listen() {
			System.out.println("Listening "+getTitle());  //calling instnace method from book class
		}
		@Override
		public String toString() {
			return super.toString() + " AudioBook [duration=" + duration + ", narrator=" + narrator + "]";
		}
		
		
		
	}