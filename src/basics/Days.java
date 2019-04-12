package basics;

public class Days {
	public static void main (String[] Args) {
		//Execute different block of code based on the value of a condition
		//Break corta las demas opciones del case si una es valida y hay mas abajo
		
		String dayOfweek ="Tuesday";
		
		switch (dayOfweek) {
		case "Monday": 
				System.out.println("Today is Monday.");
				break;
		case "Tuesday": 
				System.out.println("Today is Tuesday.");
				break;
		case "Wednesday": 
				System.out.println("Today is Wednesday.");
				break;
		case "Thursday": 
				System.out.println("Today is Thursday.");
				break;
		case "Friday": 
				System.out.println("Today is Friday.");
				break;
		
		}
	}
}
