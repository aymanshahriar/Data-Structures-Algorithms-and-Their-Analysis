package cpsc331.collections;

import cpsc331.collections.OpenHashFunction;
import java.util.Random;

/**
*
* Provides an implementation of an OpenHashFunction &mdash; that is, a class
* providing a hash function for a has table with open addressing &mdash; using
* double hashing, and by using Java&rsquo;s hashCode function to provide the
* first has function needed, along with the use of this function together with
* a randomly generated constant to provide the second<br><br>
*
* This implementation is designed to guarantee termination of algorithms when
* the table size is a sufficiently large power of two. It is not correct because
* it may cause an IndexOutOfBoundException if the table size is odd instead of even.
*
*/

public class OpenHashFunctionDouble<E> implements OpenHashFunction<E> {

  // Data Fields

  private final int TABLESIZE;

  /**
  *
  * Provides a hash function for hash table with open addressing, for a given
  * table size.
  * <br><br>
  *
  * @param tableSize the size of the hash table being supported
  * @throws IllegalArgumentException if the input table size is not psitive
  * <br><br>
  *
  * Precondition: An integer T is given as input.<br>
  * Postcondition: It T is positive then an OpehHashFunction that can be used
  *   with a hash table of size&nbsp;T is created. An IllegalArgumentException
  *   is thrown otherwise.
  *
  */

  public OpenHashFunctionDouble (int tableSize ) throws IllegalArgumentException {

    if (tableSize > 0) {

      int t = 2;
      while (t < tableSize) {
        t = t * 2;
      };
      TABLESIZE = t;

    } else {

      throw new IllegalArgumentException("Table size must be positive.");

    }

  }

  //
  // First hash function used for double hashing
  //

  private int h0 (E e) {

    return e.hashCode();

  }

  //
  // Second hash function used for double hashing, modified to ensure that the
  // value returned is always a positive odd integer when TABLESIZE is greater
  // than or equal to two
  //

  private int h1 (E e) {

    if (TABLESIZE == 1) {
      return 0;
    } else if (TABLESIZE == 2) {
      return 1;
    } else {
      long seed = (long) e.hashCode();
      Random RSource = new Random(seed);
      int generator = RSource.nextInt();
      int adjust = generator % (TABLESIZE - 1);
      if (adjust < 0) {
        adjust = adjust + TABLESIZE - 1;
      };
      if ((adjust % 2) == 0) {
        return adjust + 1;
      } else {
        return Math.max(adjust, 1);
      }
    }

  }

  //
  // Uses double hashing to provide a hash function for a hash table with
  // open addressing
  //

  public int hashValue (E e, int i) {

    int init = (h0(e) + i * h1(e)) % TABLESIZE;
    if (init < 0) {
      init = init + TABLESIZE;
    };
    return init;

  }

}
