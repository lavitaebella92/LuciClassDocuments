package day31_reviewclassandobj;

public class JavaConstructor {

	
			  public static void main(String[] args) {
			    Food food1 = new Food("Hot", "Mexican");
			    Food food4 = new Food();

//			    food1.flavor = "Hot";
//			    food1.nation = "Mexican";
//			    food1.smell();
			//
//			    Food food2 = new Food();
//			    food2.flavor = "Sweet";
//			    food2.nation = "Italian";
//			    food2.smell();
			    // we have to repeat those steps everytime

			    Food food3 = new Food("Salted", "American");
			    food3.smell();
			  }
			}