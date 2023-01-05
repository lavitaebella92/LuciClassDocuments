package day32_inheratance;

public class Person {
	// instance variables
String name;
int age;
String phoneNumber;
//instance method
public void eat ( ) {
	System.out.println(name + "is eating food");
}
public void drink ( ) {
	System.out.println(name + "is drinking water");
}
public void sleep( ) {
	System.out.println(name + "is eating sleeping");

}
// right click + source + generate to String 
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
}


}
