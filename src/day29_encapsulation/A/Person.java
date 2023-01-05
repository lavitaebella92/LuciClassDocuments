package day29_encapsulation.A;


public class Person {
    
    String name; //default access modifier visible only within the package
    
    private String dob; // visible only within the same class
    
    public String phoneNumber; // visible to whole project
    
    public void setDob(String dob1) {
        dob = dob1;
    }
    
    public String getDob() {
        return dob;
    }
    
    
    void sayHello() {
        System.out.println("Hello from Person class");
        System.out.println("This is has default access modifier. visible within the same package");
        
    }
    
    private void thisIsPrivateMethod() {
        System.out.println("Visible within the class");
    }
    
    public void thisIsPublicMethod() {
        System.out.println("Visible in whole project");
    }
    
    
}