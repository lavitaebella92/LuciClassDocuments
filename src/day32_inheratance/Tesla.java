package day32_inheratance;

public class Tesla  extends Car{
    
    public Tesla(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }
    
    public void autoPilot() {
        System.out.println(brand + " " + model + " can drive U home after party using it's innovative autopilot system.");
    }

}