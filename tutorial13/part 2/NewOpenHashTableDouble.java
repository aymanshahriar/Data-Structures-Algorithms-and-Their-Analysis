package cpsc331.collections;

import cpsc331.collections.KeyValuePair;
import cpsc331.collections.OpenHashFunctionDouble;
import java.util.NoSuchElementException;
import cpsc331.collections.TableFullException;
import java.util.ArrayList;
import java.util.Iterator;

/**
*
* Implements a hash table with open addressing that can be used to implement
* either a Set or Mapping: Table entries store ordered pairs of keys
* and values.
* <br><br>
*
* OpenHashTable Invariant:<br>
* <ol style="list-style-type: lower-alpha">
* <li> TABLESIZE is a positive integer, and a power of two. </li>
* <li> H is a well-defined total function from ordered pairs of elements
*      of&nbsp;K and nonnegative integers to the set of integers
*      between&nbsp;0 and T&minus;1. </li>
* <li> T is a table that effectively stores either &ldquo;nil&rdquo;
*      &ldquo;deleted&rdquo; or ordered pairs of keys (with type&nbsp;K)
*      and values (with type&nbsp;V). There is at most one entry of the table
*      storing any key k&isin;K, so that a partial function&nbsp;f from&nbsp;K
*      to&nbsp;V is being represented. </li>
* <li> For each k&isin;K and integer i&ge;0, if T[H(k,&nbsp;j)] does not
*      store&nbsp;k for every integer&nbsp;j such that 0&le;j&le;i&minus;1,
*      and T[H(k,&nbsp;i)] is nil, then f(k) is not defined. </li>
* <li> For every key k&isin;K, if T[h(k,&nbsp;j)] does not store&nbsp;k for every
*      integer&nbsp;j between&nbsp;0 and T&minus;1, then f(k) is not defined. </li>
* </ol>
*
*/

public class NewOpenHashTableDouble<K, V> {

  //
  // Used to identify the type of contents of the hash table
  //

  private enum Status { NIL, DELETED, OCCUPIED };

  //
  // Provides a hash table entry

  private class Entry {

    // Entry Invariant:
    // 1. status is either NIL, DELETED, or OCCUPIED.
    // 2. If status is NIL then the hash table entry storing this is "nil", and
    //    key and value are both null.
    // 3. If status is DELETED then the hash table entry storing this is
    //    "deleted", and key and value are both null.
    // 4. If status is OCCUPIED then then the hash table entry storing this is,
    //    effectively storing a key-value pair with this Entry's key and value.

    // Data Fields

    private Status status;
    private KeyValuePair<K, V> pair;

    // Default Constructor: Creates an Engry representing "nil"

    public Entry() {

      status = Status.NIL;
      pair = new KeyValuePair<K, V>();

    }

  }

  //
  // Data Fields
  //

  private int TABLESIZE;                // Size of this hash table
  private OpenHashFunctionDouble<K> H;  // Hash function to be used
  private ArrayList<Entry> T;           // Hash table with size TABLESIZE
  private int setSize;                  // Size of set or mapping represented
  private int slotsUsed;                // Number of non-NIL table entries

  /**
  *
  * Creates an empty hash table.
  * <br><br>
  *
  * @param t the table size to be used
  * @throws IllegalArgumentException if the input table size is not positive
  * <br><br>
  *
  * Precondition: An integer t is given as input. <br>
  * Postcondition: If t is positive then an empty hash table with open
  *   addressing, with size&nbsp;TABLESIZE, is created, where TABLESIZE
  *   is the smallest power of two greater than or equal to max(t, 2). An
  *   IllegalArgumentException is thrown otherwise.
  *
  */

  public NewOpenHashTableDouble (int t) throws IllegalArgumentException {

    if (t > 0) {

      TABLESIZE = 2;
      while (TABLESIZE < t) {
        TABLESIZE = 2 * TABLESIZE;
      }
      H = new OpenHashFunctionDouble<K>(TABLESIZE);
      T = new ArrayList<Entry>(TABLESIZE);
      int i = 0;
      while (i < TABLESIZE) {
        T.add(new Entry());
        i = i+1;
      };
      setSize = 0;
      slotsUsed = 0;

    } else {

      throw new IllegalArgumentException("Table size must be positive.");

    };

  }

  /**
  *
  * Searches for the value associated with a given key, throwing an exception
  * if no such value is defined.<br><br>
  *
  * @param k the key whose value is being checked for
  * @return the value associated with this key
  * @throws NoSuchElementException if no value for this key is defined
  * <br><br>
  *
  * Precondition: A non-null key k with type&nbsp;K is received as input.<br>
  * Postcondition: If a value is associated with&nbsp;k then this is returned.
  *  An IllegalArgumentException is thrown otherwise.
  *
  */

  // Implements the algorithm for searching shown in Lecture #14

  public V search (K k) throws NoSuchElementException {

    int i = 0;
    while (i < TABLESIZE) {
      int j = H.hashValue(k, i);
      Entry e = T.get(j);
      KeyValuePair<K, V> pair = e.pair;
      if ((e.status == Status.OCCUPIED) && k.equals(pair.getKey())) {
        return pair.getValue();
      } else if (e.status == Status.NIL) {
        throw new NoSuchElementException("There is no value for key "
          + k.toString() + ".");
      };
      i = i+1;
    };
    throw new NoSuchElementException("There is no value for this key.");

  }

  /**
  *
  * Reports whether a value for a given key k is defined.<br><br>
  *
  * @param k a key of type&nbsp;k
  * @return true if a value is associated with k; false otherwise
  * <br><br>
  *
  * Precondition: A key&nbsp;k of type&nbsp;k is given as input.<br>
  * Postcondition: If a value is defined for this key then &ldquo;true&rdquo;
  *   is returned; &ldquo;false&rdquo; is returned otherwise.
  *
  */

  public boolean defined (K k) {

   try {

     V v = this.search(k);
     return true;

   } catch (NoSuchElementException e) {
     return false;
   }

  }

  // Creates new hash table storing the contents of the original one.

  private void reHash() {
    increaseTableSize();
    copy();
  }



  private void increaseTableSize() {
    double n = ((double) setSize) / ((double) TABLESIZE);
    if (n > 0.25 ) && (n <= 0.5) {
      TABLESIZE = TABLESIZE * 2;
    }
    if (n > 0.5) {
      TABLESIZE = TABLESIZE * 4;
    }
  }

  private void copy() {
    ArrayList<Entry> newT = new ArrayList<Entry>(TABLESIZE);
    Iter iter = new Iter();
    try {
      while(iter.hasNext()) {
        Entry e = iter.next();
        newT.add(e);
      }
    T = newT;
    }
    catch (TableFullException ex) {
      TABLESIZE *= TABLESIZE * 2;
      copy();
    }
  }


  /**
  *
  * Sets the value associated with an input key k to be an input value v.<br><br>
  *
  * @param k the value for which a new value is to be defined
  * @param v the value to be associated with this key
  * <br><br>
  *
  * Precondition: A key k with type&nbsp;K and value v with type&nbsp;V are
  *  given as input.<br>
  * Postcondition: The partial function f being represented is changed so that
  *  f(k) = v.
  *
  */

  // The algorithm here includes a rehash (that is, creation of a new hash table)
  // if either the hash table has become too full or an attempt to insert an element
  // has failed.

  public void set (K k, V v) {

    if (2 * slotsUsed() > TABLESIZE) {
      reHash();
    };
    boolean success = false;
    while (!success) {
      int i = 0;
      boolean found = false;
      boolean located = false;
      int location_index = -1;

      while ((i < TABLESIZE) && !found) {
        int j = H.hashValue(k, i);
        Entry e = T.get(j);
        KeyValuePair<K, V> pair = e.pair;

        if ((e.status == Status.OCCUPIED) && (k.equals(pair.getKey()))) {
          pair.setValue(v);
          found = true;
          success = true;
        } else if  ((e.status == Status.DELETED) && !located) {
          located = true;
          location_index = j;
          i = i+1;
        } else if (e.status == Status.NIL) {
          if (located) {
           e = T.get(location_index);
           slotsUsed = slotsUsed - 1;
           pair = e.pair;
          };
          e.status = Status.OCCUPIED;
          pair.setKey(k);
          pair.setValue(v);
          slotsUsed = slotsUsed + 1;
          setSize = setSize + 1;
          found = true;
          success = true;
        } else {
          i = i+1;
        };
      };
      if (!found) {
        reHash();
      };
    };

  }


  /**
  *
  * Sets the value for a given key to be undefined.<br><br>
  *
  * @param k the key for which no value should be defined
  * @return the value previously associated with this key
  * @throws NoSuchElementException if no value was defined for this key
  * <br><br>
  *
  * Precondition: A key k of type&nbsp;K is given as input.<br>
  * Postcondition: If a value v was associated with this key then this value
  *  is returned and no value is associated with the key after that.
  *  A NoSuchElementException is thrown otherwise.
  *
  */

  // Implements the algorithm from Lecture #9

  public V remove (K k) throws NoSuchElementException {

    int i = 0;
    while (i < TABLESIZE) {

      int j = H.hashValue(k, i);
      Entry e = T.get(j);
      KeyValuePair<K, V> pair = e.pair;

      if ((e.status == Status.OCCUPIED) && k.equals(pair.getKey())) {
        V v = pair.getValue();
        pair.setKey(null);
        pair.setValue(null);
        e.status = Status.DELETED;
        setSize = setSize - 1;
        return v;
      } else {
        i = i+1;
      };

    };

    throw new NoSuchElementException("Key " + k.toString() + "was not found.");

  }

  /**
  *
  * Provides an Iterator for this hash table
  *
  */

  public class Iter implements Iterator<KeyValuePair<K, V>> {

    // Data Fields

    private int cursor;     // Index of the next element to be reported

    public Iter() {

      cursor = 0;
      Entry e = T.get(cursor);
      while ((cursor < TABLESIZE) && (e.status != Status.OCCUPIED)) {
        cursor = cursor + 1;
        if (cursor < TABLESIZE) {
          e = T.get(cursor);
        };
      };
    }

    // Implements the Iterator's "hasNext" method

    public boolean hasNext() {
      return (cursor < TABLESIZE);
    }

    // Implements the Iterator's "next" method

    public KeyValuePair<K, V> next() throws NoSuchElementException {
      if (cursor < TABLESIZE) {
        Entry e = T.get(cursor);
        KeyValuePair<K, V> pair = e.pair;
        cursor = cursor + 1;
        if (cursor < TABLESIZE) {
          e = T.get(cursor);
        };
        while ((cursor < TABLESIZE) && (e.status != Status.OCCUPIED)) {
          cursor = cursor + 1;
          if (cursor < TABLESIZE) {
            e = T.get(cursor);
          };
        };
        return pair;
      } else {
        throw new NoSuchElementException("No entries left in this table.");
      }
    }


  }

  // Provides this table's hash function - for testing

  OpenHashFunctionDouble<K> hashFunction() {
    return H;
  }

  // Returns the table size - used for teting

  int tableSize(){
    return TABLESIZE;
  }


  // Returns the number of non-NIL table locations - used for teting

  int slotsUsed() {
    return slotsUsed;
  }

}
