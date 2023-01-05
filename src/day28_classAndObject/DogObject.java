package day28_classAndObject;

public class DogObject {


		/*SetInfo(String c, String b, String s, int a) {
		    	color =c;
		    	breed=b;
		    	size=s;
		    	age=a;*/
		    	
		   public static void main(String[] args) {
		        Dog d = new Dog();
		        d.setInfo("John", "Neapolitan Mastiff", "Small", 'M', 3);
		        
		        System.out.println(d.toString());
		        
		        d.bark();
		        d.eat();
		        d.play();
		        
		    }

		}