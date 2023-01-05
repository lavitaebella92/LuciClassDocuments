package day25_MethodReturnValue;

public class HomeworkTask4WithMethod {

      public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * create string array, and store the names of your class mates (10) reverse
		 * each students names and print them in separate lines
		 * 
		 * Example: ```text input: arr = {java, python, c#}
		 * 
		 * output: avaJ nohtyp #c
		 */

		String Arr[] = { "Rimer", "Alejandro", "Gigi", "Karen", "Carlos", "Bahar", "Stefani", "Ashley", "Roman",
				"Zolboo" };

		  for (String each : Arr) {
	            
	            System.out.println(StringUtils.reverseAString(each));
	            
        
		
		
      }
}
}