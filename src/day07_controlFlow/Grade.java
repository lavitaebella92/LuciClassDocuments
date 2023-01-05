package day07_controlFlow;

public class Grade {

	public static void main(String[] args) {

		int score = -35;

		if (score >= 0 && score <= 100) {

			if (score >= 90 && score <= 100) {
				System.out.println("A");

			}

			if (score >= 80 && score < 90) {
				System.out.println("B");
			}

			if (score >= 70 && score < 80) {
				System.out.println("C");
			}

			if (score >= 60 && score < 70) {
				System.out.println("D");
			}

			if (score >= 0 && score < 60) {
				System.out.println("F");
			}

		} else {
			System.out.println("Invalid Score. It must be between 0 and 100");

		}

	}

}
