package day07_controlFlow;

public class OpenBrowser {

	public static void main(String[] args) {
		
		String browser = "Chrome";
		
		switch (browser) {
		case "IE":
			System.out.println("Open Internet Explorer");
			//System.out.println("WebDriver drive =new ieDriver();");
			//WebDriver driver =new ieDriver();
			break;
		case "Chrome":	
			System.out.println("Open Chrome Browser");
//			WebDriver driver =new chromDriver();
			break;
		case "Safari":	
			System.out.println("Open Safari Browser");
			break;
		default:	
			System.out.println("Invalid browser");
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
