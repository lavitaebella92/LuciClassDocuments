
package day29_encapsulation.C;

import day29_encapsulation.A.Person;

public class Test {
	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p.phoneNumber);
//		        System.out.println(p.name);
//		        
//		        p.sayHello();

		p.thisIsPublicMethod();

	}

}
