package Day10_loops;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write program that can find the number of days in a month.
		
String month = "January";
        
        switch (month) {
        case "January":
        case "March":	
        case "May":
        case "July":
        case "August":
        case "October":
        case "December":
        	System.out.println(month +"has 31 days!");
        	break;
        case "April":
        case "June":
        case "September":
        case "November":	
        	System.out.println(month +"has 30 days!");
        	break;
        	 default:
        	System.out.println(month+"has 28 days!");
        }
		
        
        //or
        
        int monthNum =1;
        
		boolean has31Days= monthNum==1||monthNum==3||monthNum==5||monthNum==7||monthNum==8||monthNum==10||monthNum==12;
		boolean has30Days=monthNum==4 || monthNum==6 ||monthNum==9 ||monthNum==11;
	
		
		//or
		
		
		
		
		
		if (has31Days) {
			System.out.println("has 31 days!");
		}else if (has30Days) {
			System.out.println("has 30 days!");
		}else {
			System.out.println("has 28 days!");
		}
		
		
		

	}

}
