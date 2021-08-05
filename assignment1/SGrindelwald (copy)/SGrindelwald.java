


public class SGrindelwald {

        // This program is a recursive implementation of the sGrin algorith specified in assignment 1.
        // The program takes in an integer n, which is entered as the first command line 
        // argument, as input.
        // 
        // If n is nonnegative, the nth Grindelwald number that is returned by the algorithm is then printed as
        // output. Otherwise, the user will be told to that a single or nonnegative integer input is required.
        //
        // Author: Ayman Shahriar ID: 10180260
        //
        // Citation (APA format for lecture notes):
        // Eberly, W. (2019). Java implementation of the algorithm considered in this lecture, lecture#3 
        //      [Example program]. Retrieved from http://pages.cpsc.ucalgary.ca/~eberly/Courses/CPSC331/2019a/Development/D02/Fibonacci1.java 


	public static void main(String[] args) {
		if ((args.length) != 1) {
			System.out.println("Gadzooks! One integer input is required.");
		}
		
		else {	
			
			try{
                        	Integer.parseInt(args[0]);
                	}
                	catch(NumberFormatException e){
                        	System.out.println("Gadzooks! One integer input is required.");
				System.exit(0);
                	}


			int n = Integer.parseInt(args[0]);
			if (n >= 0) {
				System.out.println(sGrin(n));
			}
			else {
				System.out.println("Gadzooks! The integer input cannot be negative.");
			}
		}
		
	}	

	// A recursive algorithm for the "Extended Grindelwald Gaggle Computation" problem
        //
        // Precondition: An integer n is given as input
        // Postcondition: If n is nonnegative, the nth fibonacci number, F_n, is returned as output.
	// An IllegalArgumentException is thrown otherwise.
        //
        // Bound function: n
	//
	// Bound on running time:
	// Let T_sGrin(n) be the bound on the running time of this algorithm executed with nonnegative integer n
	// Then, T_sGrin(n) >= ((3/2) ^ n) for all nonnegative integers n.

	protected static int sGrin(int n) {
		
		// Assertion: n is an integer input

		if (n == 0) {
		
		// Assertion: n is an integer input such that n = 0 
			
			return 1;

			// Assertion:
                        // 1) n is an integer input such that n = 0
                        // 2) The nth Grindelwald number, G_n = G_0 = 1, is returned as output

		}	

		else if (n == 1) {
		// Assertion: n is an integer input such that n = 1
			return 2;
			// Assertion:
                        // 1) n is an integer input such that n = 1
                        // 2) The nth Grindelwald number, G_n = G_1 = 2, is returned as output

		}
	
		else if (n == 2) {
		// Assertion: n is an integer input such that n = 2
			return 3;
			// Assertion:
                        // 1) n is an integer input such that n = 2
                        // 2) The nth Grindelwald number, G_n = G_2 = 3, is returned as output

		}
	
		else if (n == 3) {
		// Assertion: n is an integer input such that n = 3
			return 4;
			// Assertion:
                        // 1) n is an integer input such that n = 3
                        // 2) The nth Grindelwald number, G_n = G_3 = 4, is returned as output

		}
	
		else if ( (n >= 4) && ((n % 2) == 0) ) {
		// Assertion: 
		// 1) n is an integer input such that n is greater than or equal to 4
		// 2) n is an even integer
			return ( (2 * sGrin(n-1)) - (2 * sGrin(n-3)) + sGrin(n-4) );
			// Assertion:
	                // 1) n is an integer input such that n is greater than or equal to 4
	                // 2) n is an even integer
			// 3) The nth Grindelwald number, G_n = 2*G_n-1 - 2*G_n-3 + G_n-4, is returned as output

		}
	
		else if ((n >= 4) && ((n % 2) != 0)){
		// Assertion:
                // 1) n is an integer input such that n is greater than or equal to 4
                // 2) n is an odd integer

			return ( sGrin(n-1) + (3 * sGrin(n-2)) - (5 * sGrin(n-3)) + (2 * sGrin(n-4)) );
			// Assertion:
                        // 1) n is an integer input such that n is greater than or equal to 4
                        // 2) n is an odd integer
                        // 3) The nth Grindelwald number, G_n = G_n-1 + 3*G_n-2 - 5*G_n-3 + 2*G_n-4, is returned as output


		}

		else {
		// Assertion: n is a negative integer input
			throw new IllegalArgumentException();
			// Assertion: n is a negative integer input
			// Assertion: an IllegalArgumentException has been thrown
		}
	

		
	// Assertion:
  	// 1. n is an integer input.
    	// 2. If n is non-negative then the nth Grindelwald number, G_n is returned as output
    	// 3. If n is negative then an IllegalArgumentException has been thrown.
  
	
	}






















}
