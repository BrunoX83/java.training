package Assignment2;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos un estudiante osea, un nuevo objeto
		Student2 stu1 = new Student2("Bruno", "555555");
		Student2 stu2 = new Student2("Laura", "444444");
		Student2 stu3 = new Student2("Carla", "333333");
		
		stu1.enroll("Math251");
		stu1.enroll("Engl255");
		stu1.enroll("Hist211");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

// clase con los objetos

class Student2 {
	// Propiedades
	private static int ID = 10;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String courses ="";
	private static final int costOfCourse = 800;
	private int balance = 0;
	private String phone;
	private String city;
	private String state;
	
	public Student2(String name, String SSN) {
		// son los datos que se pasan del main como parametros
		ID++;
		this.name = name;
		this.SSN = SSN;
		setUserID();
//		/setAccountID;
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + ID + "@sdetuniverity.com";
		System.out.println("Your email: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		userID = ID + "." + randNum + "." + SSN.substring(2);
		//System.out.println(randNum);
		System.out.println("Your User ID #: " + userID);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		//System.out.println(courses);
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	
	@Override
	public String toString() {
		return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\n[BALANCE: " + balance + " ]";
	}
}