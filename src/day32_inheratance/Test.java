package day32_inheratance;

public class Test {
		public static void main(String[] args) {
			SubClass sb = new SubClass();
			sb.openBrowser();
			sb.close();
			
			System.out.println(sb.url);

		}
	}