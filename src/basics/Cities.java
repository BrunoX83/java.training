package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare & Define an Array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare array
		String[] countries;
		
		// Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		
		System.out.println("******* Do While Loop *************");
		
		// Declare & Define an Array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas" ;
		states[4] = "Utah" ;
		// do loop enters the loop THEN text condition 
		int i = 0;
		do {
			System.out.println("State: " + states[i]);
			i = i + 1 ;
		} while (i < 5) ;
		
		System.out.println("******** While Loop ************");
		
		// WHILE Loop
		int n = 0 ;
		boolean statefound = false ;
		while (!statefound) {   // ! oposite of sale cuando se transforma en TRUE osea opuesto a lo q se seteo (false)
			// System.out.println("State at " + n + " : " + states[n]);
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State Found");
				statefound = true; 
			}
			n ++; // same as n = n + 1
		}
		// FOR LOOP best structure for iterating trough an array
		System.out.println("********* FOR Loop ***********");
		// initializing; condition; incrementation
		for (int x = 0; x < 5; x++)
			System.out.println(states[x]);
	}

}
