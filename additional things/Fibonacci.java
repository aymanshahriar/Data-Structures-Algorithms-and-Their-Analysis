package cpsc331.tutorials;

public class Fibonacci {

	// This program is an implementation of the fib algorith discussed in lecture 2
	// The program takes in an integer n, which is entered as the first command line 
	// argument, as input.
	// 
	// The nth fibonacchi number that is returned by the algorithm is then printed as
	// output.
	//
	// Author: Ayman Shahriar 
	//
	// Citation (APA format for lecture notes):
	// Eberly, W. (2019). Java implementation of the algorithm considered in this lecture, lecture#3 
	// 	[Example program]. Retrieved from http://pages.cpsc.ucalgary.ca/~eberly/Courses/CPSC331/2019a/Development/D02/Fibonacci1.java 

	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(fib(n));

	}

	// A recursive algorithm for the "Fibonacci Number Computation" problem
	//
	// Precondition: A nonnegative integer n is given as input
	// Postcondition: The nth fibonacci number, F_n, is returned as output
	//
	// Bound function: n

	public static int fib(int n) {
	
		// Assertion: n is an integer input such that n is greater that or equal to 0

		if (n == 0) {

		// Assertion: n is an integer input such that n = 0

			return 0;

			// Assertion: 
			// 1) n is an integer input such that n = 0
			// 2) The nth Fibonacci number, F_n = F_0 = 0, is returned as output
	
		}

		else if (n == 1) {
		
		// Assertion: n is an integer input such that n = 1	

			return 1;

			// Assertion:
			// 1) n is an integer input such that n = 1
			// 2) The nth Fibonacci number, F_n = F_1 = 1, is returned as output
		}

		else {	
			
			// Assertion: n is an integer input such that n is bigger than or equal to 2

			return fib(n-2) + fib(n-1);

			// Assertion
			// 1) n is an integer input such that n is bigger than or equal to 2
			// 2) The nth Fibonacci number F_n = F_(n-2) + F_(n-1) is returned as output
		
		}

		// Assertion
		// 1) n is an integer input such that n is bigger than or equal to 0
		// 2) The nth Fibonacci number F_n is returned as output

	}


}

