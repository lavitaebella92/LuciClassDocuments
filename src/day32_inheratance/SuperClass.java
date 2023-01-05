package day32_inheratance;


public class SuperClass {
	// instance variables
	String url = "www.google.com";
	String userName = "test";
	String password = "test";
	
	//instance method
	public void openBrowser() {
		System.out.println("Opening chrome");
	}
	
	public void close() {
		System.out.println("Closing chrome browser");
	}
	
}