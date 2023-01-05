package day32_inheratance;

public class EBook extends Book{
String size;
int page;

//public EBook() {}
public EBook (String title, String author, double price, String size, int page) {
//call super class parameterized constructor
	super(title,"E-Book", author, price);
	this.size= size;
	this.page= page;

}
public void read() {
	System.out.println("Reading" + getTitle());
	
}
@Override
public String toString() {
	return "EBook [size=" + size + ", page=" + page + ", title=" + title + ", type=" + type + ", author=" + author
			+ ", price=" + price + "]";
}
}

