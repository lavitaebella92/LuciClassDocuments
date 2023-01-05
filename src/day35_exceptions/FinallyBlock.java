package day35_exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		/*
		String str = "Tech Circle";
		
		char chars[]= str.toCharArray();
		
		for (int i=0; i <chars.length; i++) {
			System.out.println(chars[i]);
		}
		*/
		
		
		
		// to make it faulty
		// to use eclipse trick highlight for statement and then surround with and  try /catch 
		
		
		String str = "Tech Circle";
		
		char chars[]= str.toCharArray();
		
		try {
			for (int i=0; i <= chars.length; i++) {
				System.out.println(chars[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
