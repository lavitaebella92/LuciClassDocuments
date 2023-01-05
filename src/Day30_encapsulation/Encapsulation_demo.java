package Day30_encapsulation;

public class Encapsulation_demo {
//    In Java, encapsulation is the process of bundling the data (fields) and behavior (methods) of an object together 
//    and hiding the implementation details from the outside world. 
//    Encapsulation is one of the four pillars of object-oriented programming (OOP) along with inheritance,
//    polymorphism, and abstraction.
////
    
//    Encapsulation helps to create a clear separation between the implementation 
    //details of a class and its external interface. It allows you to protect the data of 
//    an object from being accessed or modified by code outside the object, 
//    and it promotes modularity and reusability by allowing you to change 
//    the implementation of a class without affecting the code that uses it.
    
    // instance variable
    private String name;
    private String ssn;
    private String userName;
    private String password;
    private String dob;
    
    
    
//   public void setName(String n) {
//        this.name = n;
//    }
//    
//    public String getName() {
//        return name;
//    }

    
//getter and setter
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
    
}
    
    //getter and setter
    // right click empty spot
    //source
    //generate getter and setter
    
  