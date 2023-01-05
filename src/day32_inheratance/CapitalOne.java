package day32_inheratance;

public class CapitalOne {

	public static void main(String[] args) {
		
		Employee Elzat = new Employee();
		//calling from person class -->.name
		Elzat.name = "Elzat"; //inherited from person class
		Elzat.age = 20;//inherited from person class
		Elzat.phoneNumber = "12413412414";//inherited from person class
		
		
		Elzat.jobTitle ="SDET";
		Elzat.salary=120000;
		Elzat.employee_id =76823829;
		
		Elzat.eat();  //inherited from person class
		Elzat.drink();//inherited from person class
		Elzat.sleep();//inherited from person class
		Elzat.work();//inherited from employee class
		
		System.out.print(Elzat.toString());
				
		
		
		
		
		

	}

}
