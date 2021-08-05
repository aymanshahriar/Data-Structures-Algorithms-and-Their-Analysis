package cpsc331.collections;

import cpsc331.collections.OpenHashFunctionDouble;
import cpsc331.collections.OpenHashTableDouble;
import java.util.NoSuchElementException;
import cpsc331.collections.TableFullException;

// Provides simple tests of ChainHashMap

public class TestOpenHashTableDouble {

  // Data Fields

  private static OpenHashFunctionDouble <Integer> H;
  private static OpenHashTableDouble<Integer, String> T;
  private static int tableSize;

  public static void main (String[] args) {

    makeTable(args);
    testDefined(5, false);
    testGet(5, "cinq", false);
    boolean set_5 = testSet(5, "cinq");
    boolean set_3 = testSet(3, "troix");
    testGet(3, "troix", set_3);
    set_3 = testSet(3, "trois");
    testGet(3, "trois", set_3);
    boolean set_7 = testSet(7, "sept");
    testDefined(7, set_7);
    testDefined(4, false);
    boolean set_1 = testSet(1, "un");
    boolean set_4 = testSet(4, "quatre");
    boolean set_6 = testSet(6, "six");
    boolean set_9 = testSet(9, "neuf");
    boolean set_2 = testSet(2, "deux");
    boolean set_8 = testSet(8, "huit");

    System.out.println("Checking values in order.");
    testGet(1, "un", set_1);
    testGet(2, "deux", set_2);
    testGet(3, "trois", set_3);
    testGet(4, "quatre", set_4);
    testGet(5, "cinq", set_5);
    testGet(6, "six", set_6);
    testGet(7, "sept", set_7);
    testGet(8, "huit", set_8);
    testGet(9, "neuf", set_9);
    testGet(10, "dix", false);

    testRemove(1, "un", set_1);
    set_1 = false;
    testRemove(5, "cinq", set_5);
    set_5 = false;
    testRemove(6, "six", set_6);
    set_6 = false;
    testRemove(9, "neuf", set_9);
    set_9 = false;

    System.out.println("Checking values in order.");
    testGet(1, "un", set_1);
    testGet(2, "deux", set_2);
    testGet(3, "trois", set_3);
    testGet(4, "quatre", set_4);
    testGet(5, "cinq", set_5);
    testGet(6, "six", set_6);
    testGet(7, "sept", set_7);
    testGet(8, "huit", set_8);
    testGet(9, "neuf", set_9);
    testGet(10, "dix", false);

    set_5 = testSet(5, "cinq");

    System.out.println("Checking values in order.");
    testGet(1, "un", set_1);
    testGet(2, "deux", set_2);
    testGet(3, "trois", set_3);
    testGet(4, "quatre", set_4);
    testGet(5, "cinq", set_5);
    testGet(6, "six", set_6);
    testGet(7, "sept", set_7);
    testGet(8, "huit", set_8);
    testGet(9, "neuf", set_9);
    testGet(10, "dix", false);

    testRemove(6, "six", set_6);
    set_6 = false;

    testRemove(2, "deux", set_2);
    set_2 = false;
    testRemove(3, "trois", set_3);
    set_3 = false;
    testRemove(4, "quatre", set_4);
    set_4 = false;
    testRemove(5, "cinq", set_5);
    set_5 = false;
    testRemove(7, "sept", set_7);
    set_7 = false;

    System.out.println("Checking values in order.");
    testGet(1, "un", set_1);
    testGet(2, "deux", set_2);
    testGet(3, "trois", set_3);
    testGet(4, "quatre", set_4);
    testGet(5, "cinq", set_5);
    testGet(6, "six", set_6);
    testGet(7, "sept", set_7);
    testGet(8, "huit", set_8);
    testGet(9, "neuf", set_9);
    testGet(10, "dix", false);

    testRemove(8, "huit", set_8);
    set_8 = false;
    set_2 = testSet(2, "deux");

    System.out.println("Checking values in order.");
    testGet(1, "un", set_1);
    testGet(2, "deux", set_2);
    testGet(3, "trois", set_3);
    testGet(4, "quatre", set_4);
    testGet(5, "cinq", set_5);
    testGet(6, "six", set_6);
    testGet(7, "sept", set_7);
    testGet(8, "huit", set_8);
    testGet(9, "neuf", set_9);
    testGet(10, "dix", false);

    testRemove(2, "deux", set_2);
    set_2 = false;

    System.out.println("Checking values in order.");
    testGet(1, "un", set_1);
    testGet(2, "deux", set_2);
    testGet(3, "trois", set_3);
    testGet(4, "quatre", set_4);
    testGet(5, "cinq", set_5);
    testGet(6, "six", set_6);
    testGet(7, "sept", set_7);
    testGet(8, "huit", set_8);
    testGet(9, "neuf", set_9);
    testGet(10, "dix", false);

  }

  // Constructs the desired hash table

  private static void makeTable(String[] args) {

    System.out.println();
    System.out.println("Trying to create a hash table with non-positive size.");
    try {
      OpenHashTableDouble<Integer, String> S
        = new OpenHashTableDouble<Integer, String>(-1);
      System.out.println("An IllegalArgumentException was, incorrectly, not thrown.");
    } catch (IllegalArgumentException ex) {
      System.out.println("An IllegalArgumentException was correctly thrown.");
    };
    System.out.println("");

    tableSize = 1;
    if (args.length == 1) {
      try {
        int inputSize = Integer.parseInt(args[0]);
        tableSize = Math.max(tableSize, inputSize);
      } catch (NumberFormatException ex) {
        System.out.println("Invalid input.");
      };
    } else {
      System.out.println("Incorrect number of inputs.");
    };

    System.out.println("Creating hash table with size at least " + tableSize + ".");
    T = new OpenHashTableDouble<Integer, String>(tableSize);
    tableSize = T.tableSize();
    H = T.hashFunction();
    System.out.println("Table Size Used: " + tableSize);
    System.out.println("");

  }

  // Displays the probe sequence for a given value

  private static void probeSequence(Integer k){
   System.out.print("Probe Sequence: ");
   int i = 0;
   while (i < tableSize) {
     System.out.print(H.hashValue(k, i));
     i = i + 1;
     if (i < tableSize) {
       System.out.print(", ");
     } else {
       System.out.println("");
     };
   };

  }

  private static void testDefined(Integer k, boolean success) {

    System.out.print("Checking whether a value is defined for ");
    System.out.println(k.toString() + ".");
    probeSequence(k);
    boolean result = T.defined(k);
    if (success && result) {
      System.out.print("defined correctly reported that a value is defined");
      System.out.println(" for " + k.toString() + ".");
    } else if (success) {
      System.out.print("defined incorrectly reported that no value is defined");
      System.out.println(" for " + k.toString() + ".");
    } else if (!result) {
      System.out.print("defined correctly reported that no value is defined");
      System.out.println(" for " + k.toString() + ".");
    } else {
      System.out.print("defined incorrectly reported that a value is defined");
      System.out.println(" for " + k.toString() + ".");
    };
    System.out.println("");

  }

  private static void testGet(Integer k, String v, boolean success) {

    System.out.println("Searching for " + k);
    probeSequence(k);
    try {
      String results = T.search(k);
      if (success && v.equals(results)) {
        System.out.print("The expected string, \"");
        System.out.print(v);
        System.out.println("\", was returned.");
      } else if (success) {
        System.out.print("The expected string, \"");
        System.out.print(v);
        System.out.println("\", was not returned.");
      } else {
        System.out.print("search incorrectly failed to throw ");
        System.out.println("a NoSuchElementException.");
      };
    } catch (NoSuchElementException e) {
      if (!success) {
        System.out.println("search correctly threw a NoSuchElementException.");
      } else {
        System.out.print("search incorrectly threw a NoSuchElementException.");
      };
    };
    System.out.println("");

  }

  private static boolean testSet(Integer k, String v) {

    System.out.print("Setting the value defined for " + k.toString());
    System.out.print(" to be \"");
    System.out.print(v);
    System.out.println("\".");
    probeSequence(k);
    try {
      T.set(k, v);
      System.out.println("Value has successfully been set.");
      System.out.println("");
      return true;
    } catch (TableFullException e) {
      System.out.println("This key-value pair could not be added.");
      System.out.println("");
      return false;
    }

  }

  public static void testRemove(Integer k, String v, boolean success) {

    System.out.print("Attempting to remove a key-value pair with key ");
    System.out.println(k.toString() + ".");
    probeSequence(k);
    try {
      String results = T.remove(k);
      if (success && v.equals(results)) {
        System.out.print("remove correctly reported that " + k.toString());
        System.out.print(" had value \"");
        System.out.println(v + "\".");
      } else if (success) {
        System.out.print("remove incorrectly reported that " + k.toString());
        System.out.print(" had a value different from \"");
        System.out.println(v + "\".");
      } else {

      };
    } catch (NoSuchElementException e) {
      if (!success) {
        System.out.println("remove correctly threw a NoSuchElementException.");
      } else {
        System.out.println("remove incorrectly threw a NoSuchElementException.");
      };
    };
    System.out.println("");

  }

}
