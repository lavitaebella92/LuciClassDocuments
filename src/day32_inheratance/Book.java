package day32_inheratance;

public class Book {
//instance variable
	String title;
	String type;
	String author;
	double price;
	
	//constructor
	public Book () {}// no argument constructor
	//Parameterized constructor
	public Book (String title, String type, String author, double price ) {
	// to add value do the below	
		this.author= author;
		this.price =price;
		this.type=type;
		this.title=title;
		
	}
	//instance method
	// to read the value 
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", type=" + type + ", author=" + author + ", price=" + price + "]";
	}
	
}
