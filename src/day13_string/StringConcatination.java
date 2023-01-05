package day13_string;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Re"; 
		String str2 ="think";	
		String str3="ing";				
		String result =str1 +str2;
		System.out.println(result); //Rethink
		
		result += str3; //Rethink +ing
		
		System.out.println(result);
		
		String result2 = str1.concat(str2); //concat is like an plus sign for strings 
		System.out.println(result2); //Rethink
		
		
		String result3 = str1.concat(str2).concat(str3);
		System.out.println(result3);//rethinking		
		
		
				
		
		
		
		
		
	}

}
