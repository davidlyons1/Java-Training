package basics;

public class b_SalaryCalculator_Variables {
	public static void main(String [] args) {
		//create a variable to define our career
		
		//define a variable
		String career;
		System.out.println("Program is starting");
		
		//define a variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		//computer annual salary
		//rate = hours per week * weeks per year
		double salary = hoursPerWeek  * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of £ " + rate + " is £ " + salary + " per year");
			
	}

}
