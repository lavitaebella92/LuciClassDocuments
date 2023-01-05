package day29_encapsulation;

public class Offer {

	
	  /*
     * 1. Create a custom class named Offer 
     * Attributes: location, companyName,
     * jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
     * 
     * Actions: setInfo(): sets all the instance variables toString(): 
     * returns the full info of the Offer Object
     */

    String location;
    String companyName;
    String jobTitle;
    double salary;
    boolean hasBenefits;
    boolean hasPTO;
    boolean isWFH;
    boolean isFullTime;
    
    public Offer() {}
    
    public Offer(String l, String cn, String jt, 
            double sal, boolean hasB, boolean hasPTO1, 
            boolean isWFH1, boolean isFT) {
        location = l;
        companyName = cn;
        jobTitle = jt;
        salary = sal;
        hasBenefits = hasB;
        hasPTO = hasPTO1;
        isWFH = isWFH1;
        isFullTime = isFT;
    }

    
    
    
    // source + generate constractor does the below
    
  /*  public Offer(String location, String companyName, String jobTitle, double salary, boolean hasBenefits,
			boolean hasPTO, boolean isWFH, boolean isFullTime) {
		this.location = location;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.hasBenefits = hasBenefits;
		this.hasPTO = hasPTO;
		this.isWFH = isWFH;
		this.isFullTime = isFullTime;*/
    
	

	@Override
    public String toString() {
        return "Offer [location=" + location + ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", salary="
                + salary + ", hasBenefits=" + hasBenefits + ", hasPTO=" + hasPTO + ", isWFH=" + isWFH + ", isFullTime="
                + isFullTime + "]";
    }
}