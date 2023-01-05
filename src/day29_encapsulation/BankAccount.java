package day29_encapsulation;

public class BankAccount {

	
	    /*
	    BankAccount Task:
	                Attributes:
	                        1. accountHolder, 2. accountNumber, 3. balance

	                Actions:
	                    1. Constructor sets the accountHolder and accountNumber attributes
	                    2. toString()
	                    3. checkBalance():displays the available balance
	                    2. deposit(): increases the balance by the given amount
	                    3. withdraw(): decreases the balance by the given amount

	     */
	    
	    String accountHolder;
	    long accountNumber;
	    double balance;
	    
	    // No argument Constructor
	    public BankAccount () {}
	    
	    public BankAccount (String a, long num, double b) {
	        accountHolder = a;
	        accountNumber = num;
	        balance = b;
	    }
	    
	    //Instance methods
	    public void checkBalance() {
	        System.out.println("Your available balance is $"+balance);
	    }
	    
	    public void deposit(double amount ) {
	        balance = balance + amount;
	    }
	    
	    
	    public void withdraw(double amount ) {
	        balance = balance - amount;
	    }

	    @Override
	    public String toString() {
	        return "BankAccount [accountHolder=" + accountHolder + ", accountNumber=" + accountNumber + ", balance="
	                + balance + "]";
	    }
	    
	    
	    
	    
	    
	}