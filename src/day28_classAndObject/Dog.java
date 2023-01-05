package day28_classAndObject;

public class Dog {

	 /*
    Attributes:
        name, age, gender, breed, size, color
    Actions:
        eat(), play(), bark() ....
     */
    
    String name, breed, size;
    char gender;
    int age;
    
    public void eat() {
        System.out.println(name + " is eating bone");
    }
    
    public void play() {
        System.out.println(name + " is playing");
    }
    
    public void bark() {
        System.out.println(name + " is barking");
    }
    
    
    public void setInfo(String n, String b, String s, char g, int a) {
        name = n;
        breed = b;
        size = s;
        gender = g;
        age = a;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", breed=" + breed + ", size=" + size + ", gender=" + gender + ", age=" + age
                + "]";
    }
    
 // right click, generate to source , generate to string  will add and fill out information for you
    


    
    
    
    

}