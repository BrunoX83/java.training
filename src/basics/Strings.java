package basics;

public class Strings {
	public static void main(String[] args) {
		String bookTitles;
		String wordChoice = "Ring";
		bookTitles = "The Lord of The Rings";
		
		//if (bookTitles.contains("Ring")) {
		if (bookTitles.contains(wordChoice)) {
			//System.out.println("The book contains the word Ring");
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		//if browser == "chrome" 
		if (browser.equalsIgnoreCase("chrome")) ; {
			System.out.println("The browser is Chrome");
		}
		
		String firstname = "Bruno" ;
		String lastname = "Colella" ;
		String CI = "33712933" ;
		
		System.out.println("There are " + CI.length() + " digits in your CI.");
		
		// Print the initials plus last 4 digits of CI
		System.out.print(firstname.substring(0, 1));
		System.out.print(lastname.substring(0, 1));
		System.out.print(CI.substring(4));
	}
}
