

package day29_encapsulation.B;

import day29_encapsulation.A.Person;

public class ObjPerson2 {
    public static void main(String[] args) {
        
        Person p = new Person();
//        System.out.println(p.name);// default
//        System.out.println(p.dob); // private
        System.out.println(p.phoneNumber);
        
    }
    
    /*
    1. Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

            Actions:
                parameterized constructor sets all the instance variables
                toString(): returns the full info of the Offer Object
     */
    
}