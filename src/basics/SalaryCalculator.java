package basics;

public class SalaryCalculator {
	public static void main (String[] Args) {
		// Create a variable to define our career
		
		// Declare a Variable
		String career;
		System.out.println("Program is Starting");

		// Define a variable
		career = "Software Developer";
		System.out.println("My Career Is: " + career);
		
		// Declare & Define
		int HoursPerWeek =40;
		int WeekPerYear = 50;
		double Rate = 42.50;
		
		career = "Web Developer";
		
		double Salary = HoursPerWeek * WeekPerYear * Rate;
		System.out.println("My Salary as a " + career + " at the rate of " + Rate + " per hour is $" + Salary + " per year.");
		
		// Compute our Annual Salary
		// Rate * HoursPerWeek * WeekPerYear
	}
}
