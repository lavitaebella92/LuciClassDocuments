package day28_classAndObject;

public class StudentObject {

	public static void main(String[] args) {
		 
		        Student john = new Student();
		        john.name = "John";
		        john.age = 32;
		        john.gender = 'M';
		        john.grade = 'A';
		        //setInfo(String name1,char gender1, int age1, int ID1, String race1, char grade1) {
		        Student student2 = new Student();
		        student2.setInfo("David",'m', 28, 45675, "latino", 'B');
		        
		        Student student3 = new Student();
		        student3.setInfo("Bahara",'f', 18, 45575, "Asian", 'B');
		        
		        Student student4 = new Student();
		        student4.setInfo("Bahara",'f', 23, 45675, "Cocacian", 'B');
		        
		        
		        //int nums[] = {1,2,3,4};
		        
		        Student cohort13[] = {john, student2, student3, student4}; 
//		        
//		        for (int i = 0 ; i < cohort13.length; i++) {
//		            cohort13[i].code();
//		            cohort13[i].sleep();
//		            System.out.println(cohort13[i].getStudentInfo());
//		            
//		        }
		        
		        
		        for (int i = 0 ; i < cohort13.length; i++) {
		        
		            
		            if (cohort13[i].grade == 'A') {
		                cohort13[i].code();
		                cohort13[i].sleep();
		                System.out.println(cohort13[i].getStudentInfo());
		            }
		            
		            
		        }
		        
	}
}