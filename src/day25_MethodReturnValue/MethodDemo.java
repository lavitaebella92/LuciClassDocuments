package day25_MethodReturnValue;

public class MethodDemo {

		 public static void main(String[] args) {
		        openBrowser("safari");
		        
		        int arr[] = {1,2,3,1111,2,3};
		        int arr2[] = {1,2,3,1111,2,34444};
		        
		        largestValueFromAnArray(arr) ;
		        largestValueFromAnArray(arr2) ;
		        
		        characterCountFromAString("techcircle" , 'c');
		        characterCountFromAString("apple" , 'l');
		        characterCountFromAString("apple" , 'p');
		        characterCountFromAString("apple" , 'a');


		    }
		    
		    public static void characterCountFromAString(String str , char target  ) {
		        //String str = "java";
		        
		        //char target = 'a';
		        
		        int count = 0;
		        
		        
		        for (int i = 0 ; i < str.length() ; i++) {
		            if (str.charAt(i) == target) {
		                count++;
		            }
		        }
		            
		        System.out.println(target +" occured "+ count + " times");
		        
		    }
		    
		    
		    
		    public static void openBrowser(String browser) {
		            
		        switch(browser) {
		        case "chrome":
		            System.out.println("Open chrome browser");
		            // driver = new ChromeDriver();
		            // driver.get("www.google.com");
		            break;
		        case "firefox":
		            System.out.println("Open firefox browser");
		            // driver = new Firefox();
		            // driver.get("www.google.com");
		            break;
		        case "safari":
		            System.out.println("Open safari browser");
		            // driver = new Safari();
		            // driver.get("www.google.com");
		            
		        }

		    }
		    
		    
		    // print largest value from an integer array
		    
		    
		    public static void largestValueFromAnArray(int arr[]) {
		        //int arr[] = {2,1,2,4,5,1,3,0};
		        
		        int maxVal = arr[0];
		        
		        for (int i = 0 ; i < arr.length ; i++) {
		            if (arr[i] > maxVal) {
		                maxVal = arr[i];
		            }
		        }
		        
		        System.out.println(maxVal);
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    

		}
		
		
		
		
		
		
		
		
		
		
		
		

