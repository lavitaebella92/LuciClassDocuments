package Day30_encapsulation;

public class Employee {

	// to implement encapsulation , you need make instance variable private.
	// and generate 2 methods for each instance variable. one is reading data another is updating data.		
	
	// instance variable 
	
	// over ride portion last is employee to string method  also got data from source -generate - to string 
	

	    private String name; 
	    private int age;
	    private char gender;
	    private String jobTitle;
	    private long employeeId;
	    private double salary;
	    
	    public Employee() {} // no argument constructor
	    public Employee(String name, int age , char gender, String jobTitle, long employeeId, double salary) {
	        //this.name = name;
	        setName(name);
	        setAge(age);
	        this.setGender(gender);
	        this.setJobTitle(jobTitle);
	        this.setEmployeeId(employeeId);
	        this.setSalary(salary);
	    }
	    
	    

	    // reading name variable using getter
	    public String getName() {
	        return name;
	    }
	    // Update name variable using setter
	    public void setName(String name) {
	        this.name = name;
	        // this keywork is the Employee class
	        // this.name --> is the instance variable name
	        // this.name = name; ==> We are setting value to the instance variable name.
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public char getGender() {
	        return gender;
	    }
	    public void setGender(char gender) {
	        this.gender = gender;
	    }
	    public String getJobTitle() {
	        return jobTitle;
	    }
	    public void setJobTitle(String jobTitle) {
	        this.jobTitle = jobTitle;
	    }
	    public long getEmployeeId() {
	        return employeeId;
	    }
	    public void setEmployeeId(long employeeId) {
	        this.employeeId = employeeId;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    @Override
	    public String toString() {
	        return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", jobTitle=" + jobTitle
	                + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	    }
	    public void work() {
	        System.out.println(name + " is working from home.");
	    }
		
	    
	    
	
		
		
		
		
	}


