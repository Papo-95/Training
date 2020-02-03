package oop;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Joe", "675328972");
		Student student2 = new Student("Alan", "589338914");
		Student student3 = new Student("Carla", "125318461");
		
		student1.enroll("Math01");
		student1.enroll("Eng01");
		student1.enroll("His01");
		
		student1.pay(600);
		System.out.println(student1.toString());
	}

}

class Student{
	
	//Properties
	private static int iD=0;
	private String userId;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 300;
	private int balance = 0;
	
	public Student(String name,String SSN) {
		iD++;
		this.name = name;
		this.SSN = SSN;
		setEmail();
		setUserID();
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
	
	public String getEmail() {
		return email;
	}

	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@testmail.com";
		System.out.println("Email: " + email);
	}

	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		userId = iD + "" + randNum + SSN.substring(5);
		System.out.println("Your User ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourse;
	}
	
	public void pay(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\n[BALANCE: $" + balance + " ]";
	}
	
	
}
