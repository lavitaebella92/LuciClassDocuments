package day15_stringtask;

public class Reverse {

	public static void main(String[] args) {
	
        String input = "car";
        String output = "";
        
//        System.out.println(input.charAt(4));
//        System.out.println(input.charAt(3));
//        System.out.println(input.charAt(2));
//        System.out.println(input.charAt(1));
//        System.out.println(input.charAt(0));
        
//        for (int i = input.length()-1 ; i >=0 ; i--) {
////            System.out.print(input.charAt(i));
//            output += input.charAt(i);
//        }
//        
//        System.out.println(output);
        
//        StringBuilder sb = new StringBuilder(input);
//        System.out.println(sb.reverse());
        
        if (input.length() == 5) {
            for (int i = input.length()-1 ; i >=0 ; i--) {
//                System.out.print(input.charAt(i));
                output += input.charAt(i);
            }
            
            System.out.println(output);
        }else if (input.length() > 5) {
            System.out.println("Too long");
        }else {
            System.out.println("Too short");
        }
        
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		