package basics;

public class salaryCalculator {
	
	public static void main(String[] args){
		// lets define our annual career
		
		
		// Declare variable
		String career;
		System.out.println("Program starting");
		
		career = "Software developer";
		
		System.out.println("My carrer is " + career);
		
		// Declare and define
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek*weeksPerYear*rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $"+ salary + " per year");
		
		
		
		//computer ur salary
		//rate * hours*weeksPerYear
		
		
	}

}
