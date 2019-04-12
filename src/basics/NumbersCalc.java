package basics;

public class NumbersCalc {
	
	public static void main (String[] Args) {
		System.out.println("Program is Starting.");
		printName();
		int numA = 10;
		int numB = 20;
		
		addNumbers(numA, numB); //calling a function
		
		// 1
		//System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers (numA, numB)); //equal something to a function

		// 2
		//           (       it's a number       )		
		int product = multiplyNumbers (numA, numB); // variable equal to function
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
	}

// functions 	
// void es hacer algo y no devolver nada?
	
	static void printName() {
		System.out.println("My Name is Bruno.");
	}

	static void addNumbers(int numberA, int numberB) {
		// This function will add 2 numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}

	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB ;
		addNumbers(product, product);
		return product; 
	}

}
