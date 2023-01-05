package day29_encapsulation;

public class StudentObject {

public static void main(String[] args) {
        
        Student student1 = new Student();
        System.out.println(student1.age);
        System.out.println(student1.gender);
        System.out.println(student1.name);
        
        student1.age = 20;
        student1.name = "Carlos";
        student1.gender = 'M';
        
        System.out.println(student1.toString());
        
        student1.setName("Carlito");
        
        System.out.println(student1.toString());
        
        
    }
}