package day29_encapsulation;

//need to create bank account object
		

public class CaptalOne {

    public static void main(String[] args) {
    
        BankAccount captalOne = new BankAccount("Carlito", 523649, 500000); // calling parameterized constructor
        
        captalOne.checkBalance();
        
        captalOne.deposit(100000);
        captalOne.checkBalance();
        
        captalOne.withdraw(4.5);
        
        captalOne.checkBalance();
        
        System.out.println(captalOne.toString());
    }

}