package day12_review;

public class HomeworkHelp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   // prompt: ln, fn, age, speedlimit, actualspeed, inConstructionZone
	    String fn = "Leng";
	    String ln = "S.";
	    int age = 30;
	    int speedLimit = 45;
	    int actualSpeed = 68;
	    int fine = 0;
	    boolean isConstructionZone = false;

	    int overSpeedLimit = actualSpeed - speedLimit;
	    System.out.println("overSpeedLimit = " + overSpeedLimit);
	    if (overSpeedLimit < 5) {

	    }
	    else if (overSpeedLimit <= 20) {
	      fine = overSpeedLimit/5*30;
	    }
	    else if (overSpeedLimit > 20) {
	      fine = overSpeedLimit/5*50;
	    }

	    if (isConstructionZone) fine *= 2;

	    System.out.println("fine = " + fine);
	  }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


