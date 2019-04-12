package OOP;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// instantiating an object
		Person person1 = new Person();  // creamos una variable person1 y la apuntamos a la clase Person que se creo arriba con los atributos
		
		// define some properties
		person1.name = "Bruno";
		person1.email = "bruno@test.com";
		person1.phone = "096181283";
		
		// abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		
		person2.name = "Teffi";
		person2.email = "teffi@test.com";
		person2.phone = "093769394";
		person2.sleep();
		/*
		// Person -
		
		// Atributes, variables, adjectives, descriptors
		String name = "Bruno";
		String email = "bruno@test.com";
		String phone = "096181283";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		walking(name);
		
		// do the same as above for another person
		String name2 = "Teffi";
		String email2 = "teffi@test.com";
		String phone2 = "093769394";
		
		// Action, activity, behavior 2
		//System.out.println(name2 + " is walking");
		System.out.println(name2 + " is eating");	
		walking(name2);
		
		// Binding attributes and properties together
		
		
	}

	// enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		 */
	}
	
}
