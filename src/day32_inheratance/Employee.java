package day32_inheratance;

public class Employee extends Person{
// by doing this employee inherantance all the data from Person Class
	
	
//instance variables
	String jobTitle;
	double salary;
	long employee_id;
	
// instance method
	
 public void work() {
	 System.out.println(name + "is working");
 }

@Override
public String toString() {
	return "Employee [jobTitle=" + jobTitle + ", salary=" + salary + ", employee_id=" + employee_id + "]";
}
 
 
}
