package day35_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
    // Exception that occurred at compile time		

		
		File file = new File ("C://documents/asdfasdd");
		
		FileReader fr = new FileReader(file);
		
		/* there are only two way to handle exceptions:
		 * 1 : you can catch the exception using try catch statement
		 * 2: you can also throw the exception
		 */
		
		
		
	}

}
