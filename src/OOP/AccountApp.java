package OOP;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmortSchedule();
		la.setTerm(20);
		
		// Polymorphism changes where we are pointing
		IRate account1 = new LoanAccount(); // se crea la variable account1 basado en las propiedades de IRATE pero apuntando a las propiedades de LoanAccount
		account1.increaseRate();
		account1.setRate();
	}

}
