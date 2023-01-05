package day31_reviewclassandobj;
public class Phone {
	  // state / properties / attribute / field
	  // instance variable
	  String brand;
	  String material;
	  boolean isOn;

	  // function / behavior / method
	  // access modifier: public, private, default, protected
	  /*default*/ void call(String phoneNumber) {
	    System.out.println("Phone.call()");
	    System.out.println("Call " + phoneNumber);
	  }

	  void turnOn() {
	    isOn = true;
	    System.out.println("Phone is on: " + isOn);
	  }
	  void turnOff() {
	    isOn = false;
	    System.out.println("Phone is on: " + isOn);
	  }
	}