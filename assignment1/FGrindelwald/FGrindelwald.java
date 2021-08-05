package cpsc331.assignment1;


public class FGrindelwald {

        // This program is an iterative implementation of the fGrin algorith specified in assignment 1.
        // The program takes in an integer n, which is entered as the first command line 
        // argument, as input.
        // 
        // If n is nonnegative, the nth Grindelwald number that is returned by the algorithm is then printed as
        // output. Otherwise, the user will be told to that a single or nonnegative integer input is required.
        //
        // Author: Ayman Shahriar ID: 10180260
        //
        // Citation (APA format for lecture notes):
        // Eberly, W. (2019). Java implementation of the algorithm considered in this lecture, lecture#4 
        //      [Example program]. Retrieved from http://pages.cpsc.ucalgary.ca/~eberly/Courses/CPSC331/2019a/Development/D02/Fibonacci1.java 


	public static void main(String[] args) {
		if ((args.length) != 1) {
			System.out.println("Gadzooks! One integer input is required.");
		}
		else {
			try {
				Integer.parseInt(args[0]);
			}
			catch (NumberFormatException e){
				System.out.println("Gadzooks! One integer input is required.");
				System.exit(0);
			}
			
			
			int n = Integer.parseInt(args[0]);
			if (n >= 0){
				System.out.println(fGrin(n));
			}
			else {
				System.out.println("Gadzooks! The integer input cannot be negative.");
			}
		
		}
	
	}

	// An iterative algorithm for the "Extended Grindelwald Gaggle Computation" problem
        //
        // Precondition: An integer n is given as input
        // Postcondition: If n is nonnegative, the nth fibonacci number, F_n, is returned as output.
        // An IllegalArgumentException is thrown otherwise.
        //
        // Bound on running time:
        // Let T_sGrin(n) be the bound on the running time of this algorithm executed with nonnegative integer n
        // Then, T_sGrin(n) = 2 	if n = 0
	// 	 T_sGrin(n) = 3 	if n = 1
	// 	 T_sGrin(n) = 4 	if n = 2
	// 	 T_sGrin(n) = 5		if n = 3
	// 	 T_sGrin(n) = 4*n 	if n is bigger than or equal to 4




	protected static int fGrin(int n) {
		// Asssertion: n is an integer input
		if (n == 0) {
			
			return 1;
		}
		else if (n == 1) {
			return 2;
		}
		else if (n == 2) {
			return 3;
		}
	
		else if (n == 3) {
			return 4;
		}

		else  if (n >= 4) {
			int[] G = new int[n+1];
			
			G[0] = 1;
			G[1] = 2;
			G[2] = 3;
			G[3] = 4;

			int i = 4;
			
			// Loop Invariant:
			// 1) n is an integer input such that n is greater than or equal to 4.
			// 2) G is a (variable) integer array with length n+1.
			// 3) i is an integer variable such that i is between 4 and n-1 (inclusive).
			// 4) G[j] = G_j for every integer j such that j is between 0 and i-1 (inclusive).
			//
			// Bound function for this while loop: (n+1) - i


			while (i <= n) {
				if ((i % 2) == 0) {
					G[i] = (2*G[i-1]) - (2*G[i-3]) + G[i-4];
				}
				else {
					G[i] = G[i-1] + (3*G[i-2]) - (5*G[i-3]) + (2*G[i-4]);
				}
				i += 1;
			}
			
			return G[n];

		}
	
		else {
			throw new IllegalArgumentException();
		
		}
	
	// Assertion:
	// 1) n is an integer input
	// 2) If n is nonnegative, then the nth Grindelwald number, G_n, is returned as output
	// 3) If n is negative, then an IllegalArgumentException is thrown


	}













}
