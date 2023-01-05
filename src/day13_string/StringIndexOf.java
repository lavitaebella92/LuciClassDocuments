package day13_string;

public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// values not found will display as -1
//						012345678910   15
		String name = "President George Washington";

		System.out.println(name.indexOf('P'));// 0
		System.out.println(name.indexOf('G'));// 10
		System.out.println(name.indexOf('W'));// 17
		System.out.println(name.indexOf('x')); // -1

		System.out.println(name.indexOf('e'));// 2
		System.out.println(name.indexOf('e', 10)); // 11
		System.out.println(name.indexOf("George")); // 10

		System.out.println(name.indexOf("eo")); // 11

		System.out.println(name.lastIndexOf('e')); // 15

		String gmail = "Test@gmail.com";

		if (gmail.indexOf("gmail") > -1) {
			System.out.println("Gmail account");

		}

	}
}
