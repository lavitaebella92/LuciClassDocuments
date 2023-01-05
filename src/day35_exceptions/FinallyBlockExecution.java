package day35_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract class FinallyBlockExecution {

	public static void main(String[] args) {
		
		
		File file = new File("location"); // this code will throw error because there is error in this location

		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("Catch block");
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}

		String str = "java";
		for (char a : str.toCharArray()) {
			System.out.println(a);
		}
		
		
		
		
		

	}

}
