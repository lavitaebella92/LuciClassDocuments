package day32_inheratance;

public class BMW extends Car {

    public BMW(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }
    
    public void breaksDown() {
        System.out.println(brand + " " + model + " always breaks down and everyone know is.");
    }
    
    public void racing() {
        System.out.println(brand + " " + model + " is racing.");
    }
    
}