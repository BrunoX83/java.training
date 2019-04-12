package OOP;

public class BankAccount implements IRate {
	// Define Variables
	String accountNumber;
	
	// static >> belongs to the CLASS not to the object instance
	// final >> constant (often static final)
	private static final String routingNumber = "111111";
	
	// Instance Variables
	private String name;
	private String SSN;
	String accountType;
	double balance = 0;
	
	// Constructor Definitions: Unique methods
		// 1. Used to define or setup initialize properties of an object
		// 2. Are IMPLICITLY call upon INSTANTIATION
		// 3. Same name as the class itself
		// 4. Have no return type
	
	BankAccount(){
		System.out.println("New Account Created");
	}
	// Overloading, call the same method name with different arguments
	BankAccount(String accountType){
		System.out.println("New Account: " + accountType);
	}

	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all LOCAL variables (only withing the block)
		
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit of: $" + initDeposit);
		String Msg = null;												// si defino MSg afuera del if lo puedo usar adentro y print afuera
		if (initDeposit <1000) {
			Msg = "ERROR: Minimum deposit must be at least $1.000";
		}
		else {
			Msg ="Thanks for your initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance+initDeposit;
	}	
	
	// getters / Setters
	
	// Allow user to define the Name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	
	public String getName() {
		return name;
	}
	
		
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	// Interface methods
	
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing rate");
	}
	
	
	// Define Methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	void whitdraw(double amount) {
		balance = balance + amount;
		showActivity("Whitdraw");
	}
	
	void checkValance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}

	// Private : can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction " + activity);
		System.out.println("Your new balance is: $" + balance);
		
	}
	@Override
	public String toString() {
		return "[ NAME:" + name + ". ACCOUNT #: " + accountNumber + ". ROUTING #: " + routingNumber + ". BALANCE: $" + balance +" ]" ;
	}

}
