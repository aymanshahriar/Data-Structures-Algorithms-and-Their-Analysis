//package cpsc331.tutorials;

import java.math.BigInteger;

public class Fibonacci3b
{

   // An implementation of the iterative algorithm  fibLoop discussed
   // in Lecture #3, using Java's BigInter data type to represent
   // arbitrarily lage inters. It is expected here that one
   // argument is included on the command line and that this is
   // is the integer n that will be supplied as input to this
   // recursive algorithm.
   //
   // The integer output that is supplied by the algorithm will be
   // printed as output.
   //
   // Various exceptions are caught and thrown in this version of the algorithm.
   
   public static void main(String[] args) {
   
     if (args.length == 0) {
    
        System.out.println("No input found! A nonnegative integer is required.");
    
     } else if (args.length > 1) {
    
        System.out.println("Too many inputs found! Only one is required.");
    
     } else {
    
        try {
      
          int n = Integer.parseInt(args[0]);
          System.out.println(fibLoop(n).toString());
      
        }
      
        catch (NumberFormatException e) {
      
          System.out.println("The input is not an integer.");
      
        }
      
        catch (IllegalArgumentException e) {
      
          System.out.println("The input is a negative integer.");
      
        }
      
        catch (VirtualMachineError e) {
      
          System.out.println("The input is too large for this algorithm to be used.");
      
        }
    
      }

   }
   
   public static BigInteger fibLoop(int n) {
   
     // Assertion: n is an integer input such that n is greater than
     // or equal to zero.
     
     if (n == 0) {
     
       return BigInteger.ZERO;
     
     } else if (n >= 1) {
     
       BigInteger[] F = new BigInteger[n+1];
       F[0] = BigInteger.ZERO;
       F[1] = BigInteger.ONE;
       int i = 1;
       
       // Loop Invariant:
       // 1. n is an integer input whose value is greater than or equal to 1.
       // 2. F is a (variable) BigInteger array with length n+1.
       // 3. i is an integer variable that is greater than or equal to 1
       //    and less than or equal to n.
       // 4. F[j] is F_j, the jth Fibonacci number, for every integer j such
       //    that is betwen 0 and i (inclusive).
       //
       // Bound Function for Loop: n-i
       
       while (i < n) {
       
         F[i+1] = F[i-1].add(F[i]);
         i = i+1;
       
       };
       
       return F[n];
               
     } else {
     
       throw new IllegalArgumentException(Integer.toString(n));
     }
     
     // Assertion:
     // 1. n is an integer input.
     // 2. If n is non-negative then an integer array with length 2 whose first
     //    and second elements are the values F_n and F_(n+1), respectively, has
     //    been returned as output.
     // 3. If n is negative then an IllegalArgumentException has been thrown.
   
   }

}
