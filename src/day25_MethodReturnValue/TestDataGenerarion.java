package day25_MethodReturnValue;

import java.util.Random;

public class TestDataGenerarion {

	public static void main(String[] args) {

// append means adding		
// string builder means
// this generates new phone numbers 		

		for (int i = 1; i < 101; i++) {
			System.out.println(randomPhoneNumber());
		}

	}

	public static String randomPhoneNumber() {

		StringBuilder sb = new StringBuilder();
		Random random = new Random();

		sb.append("703");
		sb.append(random.nextInt(999));
		sb.append(random.nextInt(9999));

		return sb.toString();
	}

}

