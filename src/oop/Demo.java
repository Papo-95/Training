package oop;

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
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7823671837217";	
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		/*
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7823671837217";
		
		//Action, activities, behavior
		System.out.println(name + " is walking.");
		System.out.println(name + " is eating.");
		
		walking(name);
		*/
	}
	
	//Enhance by adding function to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
	}

}
