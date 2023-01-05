package day06_operators;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		int hourlyRate =66;
		int weeklyhour=40;
		double stateTaxRate =5.9;
		double federalTaxRate =28;
		
		double beforeTax = hourlyRate *weeklyhour * 52;
		double federalTax= beforeTax * federalTaxRate /100;
		double stateTax = beforeTax* stateTaxRate/100;
		
		
		
		System.out.println(beforeTax);
		System.out.println(federalTax);
		System.out.println(stateTax);
		
		double netIncome = beforeTax - federalTax - stateTax;
		System.out.println(netIncome);
		
		
		
		
		
		
		
		
		

	}

}
