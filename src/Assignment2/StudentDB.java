package Assignment2;

public class StudentDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();

		System.out.println(stu.setStudent("Bruno", "Colella", "123456"));
		System.out.println(stu.setUsrID());
		System.out.println(stu.buildEmail());
		System.out.println("**************************************************");

		stu.setPhone("+598 26828314");
		stu.setCity("Montevideo");
		stu.setState("Canelones");
		
		System.out.println("Phone Number : " + stu.stuPhone() + "\n"+"City/State : " + stu.stuCity() + " | " + stu.stuState());
		System.out.println("**************************************************");
		
		System.out.println(stu.toString());		
		
	}
}

class Student {
	private static int ID = 1983 ;
	private String usrID;
	private String eMail;
	private String name;
	private String lastName;
	private String SSN;
	private String stuPhone;
	private String stuCity;
	private String stuState;

	public String setStudent(String name, String lastName, String SSN) {
		this.name = name;
		this.lastName = lastName;
		this.SSN = SSN;
		return "Student Name: " + name + " " + lastName + "\n" + "Student SSN: " + SSN; 
	}

	public String  setUsrID() {
		int random = ((int)(Math.random()*9000)+1000);
		usrID = ID + "-" + random + "-" + SSN.substring(4);
		return "Your User ID is: " + usrID;
	}

	public String buildEmail() {
		 eMail = name.substring(0,1) + lastName.substring(0,1) + "." + usrID + "@college.edu";
		 return "Your Student eMail is: " + eMail;
	}

	public String stuPhone() {
		return stuPhone;
	}
	
	public void setPhone(String Phone) {
		stuPhone = Phone;
	}

	public String stuCity() {
		return stuCity;
	}
	
	public void setCity(String City) {
		stuCity = City;
	}
	
	public String stuState() {
		return stuState;
	}
	
	public void setState(String State) {
		stuState = State;
	}	
	
	 void enroll() {
		
	}
	 void pay() {
		
	}
	 void checkBalance() {
		
	}
	
	 void showCourses() {
		
	}

	@Override
	public String toString() {
		return "[Studen Name: " + name + "]\n[Useer ID: " + usrID + "]\n" + "[eMail Address: " + eMail + "]\n" + "[SSN: " + SSN + "]\n"+"[Phone: " + stuPhone +"]\n" + "[City/State: " + stuCity + " | " + stuState + "]";
	}

}
	
	/*	
	String UsrID () {
		return usrID;
	}
	 */	
	
	/*	
	String eMail() {
		return eMail;
	}
	 */	
	/*
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return "Student Name: " + name; 
	}	

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	public String setSSN() {
		return "Student SSN: " + SSN; 
	}	
	
*/
//Students solutions :)
/* =======================================================================================================================================================

package lab2;

import java.text.DecimalFormat;

public class StudentDb {

 static String courses[] = {"Math", "Literature", "Java" };
 
 public static void main(String[] args) {
 
    showCourses();
    
    Student st1 = new Student("vladimir", "111-11-1111");
    Student st2 = new Student("donald", "222-22-2222");
 
    DecimalFormat df2 = new DecimalFormat(".##");
    
     st1.enroll();
     st1.setPhone("860-111-1111");
     st1.setCity("Boston");
     st1.setState("MA");
     st1.pay(999.75);
     st1.pay(666.11);
     
     st2.enroll();
     st2.setPhone("718-333-3333");
     st2.setCity("Riga");
     st2.setState("Latvia");
     st2.pay(777.55);
  
     
     System.out.println("\n================================");
     
     System.out.println(st1.getEmail());
     System.out.println("User ID: " + st1.getUserID());
     System.out.println("StudentPhone: " + st1.getPhone());
     System.out.println(st1.getCity() + ", " +  st1.getState());
     System.out.println("The ballance is: $" + df2.format(st1.checkBalance()));
     
     System.out.println("\n================================");
     
     System.out.println(st2.getEmail());
     System.out.println("User ID: " + st2.getUserID());
     System.out.println("StudentPhone: " + st2.getPhone());
     System.out.println(st2.getCity() + ", " +  st2.getState());
     System.out.println("The ballance is: $" + df2.format(st2.checkBalance()));
 }
 
 static void showCourses() {
  System.out.print("The courses are: ");
  for( String s: courses) {
    System.out.print(", " + s);
   }
  
 }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package lab2;

import java.util.Random;

public class Student {
 
 private String name;
 private String ssn;
 private static int ID = 100;
 private String email;
 private String userID;
 private String phone;
 private String city;
 private String state;
 private Double ballance = 0.00;
 
 private final static String emaiExt = "@student.edu";
 
 public Student() {
 }
 
 public Student(String name, String ssn) {
  this.name = name;
  this.ssn = ssn;
 }
 
 public void enroll () {
  setEmail();
  setUserID(ID++);
 }
 
 public void pay(double payment) {
  this.ballance = ballance + payment; 
 }
 
 public double checkBalance() {
  return ballance;
 }
 
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getSsn() {
  return ssn;
 }
 public void setSsn(String ssn) {
  this.ssn = ssn;
 }
 public static int getID() {
  return ID;
 }
 public static void setID(int iD) {
  ID = iD;
  
  
 }
 public String getEmail() {
  return email;
 }
 public void setEmail() {
  this.email = name + emaiExt;
 }
 public String getUserID() {
  return "" + userID;
 }
 
 public void setUserID(int ID) {
  userID = String.valueOf(ID);
  Random rand = new Random();
  int value = 1000 + rand.nextInt(8000);
  userID = userID + "-" + value + "-"+ this.ssn.substring(7);
 
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
}

=======================================================================================================================================================

// Student Class

class Student{

// Attributes for Student

private static String iD = "1946";

private String name;

private String SSN;

private String email;

private String city;

private String state;

private String UserID;

private String phone;

private String courses;

// Constructor

public Student(String name, String SSN) {

this.name = name;

this.SSN = SSN;

this.email = name + "@gmail.com";

int random = (int) (Math.random() * 1000);

int len = SSN.length();

this.UserID = iD + random + SSN.substring(len-3,len);

}

    // Methods for Student

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



public String getPhone() {

return phone;

}



public void setPhone(String phone) {

phone = phone;

}

public void enroll() {

//TBD

}

public void pay() {

//TBD

}

public void checkBalance() {

//TBD

}

public String toString() {

return name;

}

public String showCourses() {

return courses; // TBD

}

}

*/