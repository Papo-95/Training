package oop;

public class BankAccount {
	
	String accountNumber;
	String routingNumber;
	String name;
	String ssn;
	String accountType;
	
	//Constructor 
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT:" + accountType);
	}
	
	// Define methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}

}
