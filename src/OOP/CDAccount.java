package OOP;
	
	// inheriting other class attributes 
public class CDAccount extends BankAccount implements IRate {

		String IntrestRate;
		
		void compount() {
			System.out.println("Compounding intrest");
		}
}
