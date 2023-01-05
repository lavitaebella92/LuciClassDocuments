package day28_classAndObject;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {

	public static void main(String[] args) {
		
		// have to type new when you are assigning the new Object
		
		
		
	Car jeep = new Car();
	jeep.brand ="Compass";
	jeep.model="Sport";
    jeep.color="blue";		
    jeep.year=2014;
    jeep.price=5000;
    
    jeep.start();
    jeep.drive();
    jeep.stop();
    
    
    Car x5 = new Car();
    x5.brand = "BMW";
    x5.model = "X5";
    x5.color = "Black";
    x5.year = 2023;
    x5.price = 45000;
    
    
    System.out.println(x5.brand);
    x5.start();
    x5.drive();
    x5.stop();
    
    
    
    Car car2 = new Car();
    car2.brand  = "Toyota";
    car2.model = "Camry";
    car2.color = "Silver";
    car2.year= 2016;
    car2.price = 10000;
    
    
    car2.start();
    car2.drive();
    car2.stop();
    
    
    
    Car car3 = new Car();
    car3.brand = "Subaru";
    car3.model = "BRZ";
    car3.color = "Silver";
    car3.year = 2023;
    car3.price = 40000;

    car3.start();
    car3.drive();
    car3.stop();
    
    // create an array and calculate the sum prices
    
//  Create array of car and calculate the sum prices 
    
    Car car1 = new Car();
    car1.SetInfo("Tesla", "Y", "White", 2023, 50000);
    
    Car car2a = new Car();
    car2.SetInfo("Ford", "F150", "Black", 2003, 10000);
    
    Car car3b = new Car();
    car3.SetInfo("Honda", "CRV", "Silver", 2018, 20000);
    
    Car jeep1 = new Car();
	jeep.brand ="Compass";
	jeep.model="Sport";
    jeep.color="blue";		
    jeep.year=2014;
    jeep.price=5000;
  
  
  Car carMax[] = {car1,car2a,car3b,jeep1};
  
  
  double sum = 0;
  
  for (int i = 0 ; i < carMax.length ; i++) {
      carMax[i].drive();
      sum = sum + carMax[i].price;
  }
  
  System.out.println(sum);
  
  
  ArrayList<Car> list = new ArrayList<>();
  
  list.add(jeep1);
  list.addAll(Arrays.asList(car1, car2a, car3b));
  
  sum  = 0;
  
  for (int i = 0 ; i < list.size() ; i++) {
      sum += list.get(i).price;
  }
  
  System.out.println(sum);
  
 
  
  
  
  
}



   
    
    
	}

    