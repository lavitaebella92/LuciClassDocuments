package day14_subString;

public class ClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//converLettersToNynbers
		
		String str="aBz";
		str=str.toLowerCase();
		char letter =str.charAt(0);
		String num="";
		String numericStr="";
		for (int i=0; i<str.length(); i++) {
			
		
		
		
		switch(letter) {
		case 'a': System.out.println("01");num ="01"; break;
		case 'b': System.out.println("02");num ="02"; break;
		case 'c': System.out.println("03");num ="03"; break;
		case 'd': System.out.println("04");num ="04"; break;
		case 'e': System.out.println("05");num ="05"; break;
		case 'f': System.out.println("06");num ="06"; break;
		case 'g': System.out.println("07");num ="07"; break;
		case 'h': System.out.println("08");num ="08"; break;
		case 'i': System.out.println("09");num ="09"; break;
		case 'j': System.out.println("10");num ="10"; break;
		case 'k': System.out.println("11");num ="11"; break;
		case 'l': System.out.println("12");num ="12"; break;
		case 'm': System.out.println("13");num ="13"; break;
		case 'n': System.out.println("14");num ="14"; break;
		case 'o': System.out.println("15");num ="15"; break;
		case 'p': System.out.println("16");num ="16"; break;
		case 'q': System.out.println("17");num ="17"; break;
		case 'r': System.out.println("18");num ="18"; break;
		case 's': System.out.println("19");num ="19"; break;
		case 't': System.out.println("20");num ="20"; break;
		case 'u': System.out.println("21");num ="21"; break;
		case 'v': System.out.println("22");num ="22"; break;
		case 'w': System.out.println("23");num ="23"; break;
		case 'x': System.out.println("24");num ="24"; break;
		case 'y': System.out.println("25");num ="25"; break;
		case 'z': System.out.println("26");num ="26"; break;
		
		
		}
	
		numericStr=num;	
		
}

		System.out.println(numericStr);

}

}