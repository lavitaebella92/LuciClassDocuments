package day28_classAndObject;

public class Student {

	
	String name;
	char gender;
	int age;
	int ID;
	String race;
	char grade;
	
	// setinfo 
	
	public void setInfo(String name1,char gender1, int age1, int ID1, String race1, char grade1) {
		 name =name1;
		 gender =gender1;
		age= age1;
		 ID= ID1;
		race= race1;
		grade=grade1;
	}
	  public void code() {
	        System.out.println(" "+ name +"is coding" );
	    }
	    
	    
	    public void sleep() {
	        System.out.println(name +" is sleeping");
	    }
	    
	    public void food() {
	        System.out.println(name +"is hungry");
	    }
	    public String getStudentInfo() {
	        String message = "Student class  "+ " name:"+name + ", age:"+age+ ", grade:"+grade+ ", gender:"+gender;
	        return message;
	    
	    }
	
}
	

