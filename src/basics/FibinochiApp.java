package basics;

public class FibinochiApp {

	public static void main(String[] args) {
		// Fibinnaci is defined by the sum of 2 previous fibinochi numbers
		// fib 0 =0,
		// fib1=1 (1), 
		// fib2=1 (fib1+fib0), 
		// fib3=2 (fib2 + fib1), 
		// fib4=3 (fib3+fib2), 
		// fib5=5(fib4+fib3)
//	System.out.println(fib(7));
//	System.out.println(sumFunc(6));
	System.out.println(factorial(5));
	}
	
	public static int fib(int n){
		if (n==0){
			return 0;}
			else if (n==1){
				return 1;				
			}
		return (fib(n-1)+fib(n-2));
		}
	
// sum of all numbers till 1	
	public static int sumFunc(int n){
		if (n==0){
			return 0;}
			else if (n==1){
				return 1;}
		
			return (n+sumFunc(n-1));		
	}
	
	
	public static int factorial(int n){
	
	    if (n == 1)
	        return 1;
	    else
	        return n * factorial(n-1);
	}
	
	}


