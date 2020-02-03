package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		
		int[] numbers = {9,20,5,3,276};
		
		// Function that takes a value n returns the sum of numbers 1 to n
		System.out.println(sum(4));
		
		// Function that computes the factorial value
		System.out.println(factorial(4));
		
		//Functions that take an array as a parameter and return the minimum
		System.out.println(min(numbers));
		
		//Functions that take an array as a parameter and return the average
		System.out.println(avg(numbers));
		
		//Functions that take an array as a parameter and return the maximum
		System.out.println(max(numbers));
	}
	
	public static int fib(int n) {
		if(n == 0) {
			return 0;
		}
		else if( n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
	
	
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return(n+sum(n-1));
	}
	
	public static int factorial(int n) {
		 if( n == 0) {
			 return 1;
		 }
		 return (n*factorial(n-1));
	}
	
	public static int min(int[] num) {
		int min = num[0];
		for(int i = 0; i<num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		return min;
	}
	
	public static double avg(int[] num) {
		int sum = 0;
		for(int i = 0; i<num.length; i++) {
			sum = sum + num[i];
		}
		double avg = sum / num.length;
		return avg;
	}
	
	public static int max(int[] num) {
		int max = num[0];
		for(int i = 0; i<num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}

}
