package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new Bank Account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Bruno Colella";
		// with encapsulation : public API methods
		
		acc1.setName("Bruno Colella");
		System.out.println(acc1.getName());
		
		acc1.setSSN("123456");
		System.out.println("SSN: " +acc1.getSSN());
		
		acc1.accountNumber= "010203";
		acc1.balance = 10000;
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		/*acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.whitdraw(2000); 
		*/
			
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		// Polymorphism through iverloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber= "010203";
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber= "010203";
		/*
		acc3.checkValance();
		*/
		
		
		/*
		System.out.println(acc1.routinNumber);
		System.out.println(acc2.routinNumber);
		System.out.println(acc3.routinNumber);
		*/
		
		
		// Demo for inheritance
		/*CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.IntrestRate = "4.5";
		cd1.name = "Jhon";
		cd1.accountType = "CD";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
	}

}
