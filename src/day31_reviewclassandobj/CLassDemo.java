package day31_reviewclassandobj;

public class CLassDemo {

public static void main(String[] args) {
    // Functional Programing
    // focus only on function of software

    // Object Oriented Programming
    // Class and Object
    // Group all relate entities together in a class
    // create an obj of that class

    // instance == object
    // instance variable == global variable
    // static & instance

    Phone phone1 = new Phone(); // create instance of the class
    Phone phone2 = new Phone();
    Phone phone3 = new Phone();
    phone2.brand = "Apple";
    phone2.material = "Aluminum";
    phone1.brand = "Samsung";
    phone1.material = "Plastic";

    System.out.println(phone1.brand);
    System.out.println(phone1.material);
    System.out.println(phone2.brand);
    System.out.println(phone2.material);

    System.out.println(phone1);
    System.out.println(phone2);
    System.out.println(phone3);


    phone1.call("703-233-2344");
    phone1.turnOn();
  }
}