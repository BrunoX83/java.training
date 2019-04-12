package basics;

public class Weather {
	public static void main (String[] Args) {
		//Suggestion what to wear based on the weather -Temperature -
		
		int temperature = 45;
		String sunCondition = "Sunny";
		sunCondition = "Overcast";
		
		if (temperature > 80 ) {
			System.out.println("It's pelasent, wear shorts and t-shirt's.");
		}
                                 // AND		
		else if ((temperature > 60) && (sunCondition == "Sunny")) { 
			System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep tje sun out of your eyes.");
		}
		                         // OR
		else if ((temperature > 50) || (sunCondition == "Overcast")) { 
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}		
		else {
			System.out.println("Looks like a cold day, bring a sweater.");
		}
		System.out.println("The Program is Ending!.");
	}
}
