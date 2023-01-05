package day14_subString;

public class DomainName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		
//      "john.smith@github.com"
//Write a program to extract domain name from given email
//input:
//"john.smith@github.com"
//output:
//github

//input:
//test@gmail.com
//output:
//gmail
		
//				String email ="firstName.lastName@aws.com";
		
		String email = "firstName.lastName@aws.com";
        int i = email.indexOf("@") +1;
        int k = email.lastIndexOf(".");
        
        String domain = email.substring(i,k);
        System.out.println(domain);
		
		
	}

}
