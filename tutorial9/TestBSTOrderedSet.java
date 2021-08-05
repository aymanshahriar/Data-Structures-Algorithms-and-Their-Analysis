package cpsc331.collections;

import java.util.NoSuchElementException;
import cpsc331.collections.ElementFoundException;
import cpsc331.collections.OrderedSet;
import cpsc331.collections.BSTOrderedSet;

// A simple class to test BSTOrderedSet

public class TestBSTOrderedSet {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("Constructing new BSTOrderedSet");
    BSTOrderedSet<Integer> S
      = new BSTOrderedSet<Integer>();
    System.out.println();
    
    System.out.println("Checking S contains an element");
    if (S.contains(5)) {
      System.out.print("The contains method incorrectly reported");
      System.out.println(" that an element belongs to this set.");
    } else {
      System.out.print("The contains method correctly reported");
      System.out.print(" that the element does not belong to");
      System.out.println(" this set.");
    };
    System.out.println();
    
    System.out.println("Including 5.");
    try {
      S.include(5);
      if (S.contains(5)) {
        System.out.print("contains correctly reported that 5");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 5");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();

    System.out.println("Including 3.");
    try {
      S.include(3);
      if (S.contains(3)) {
        System.out.print("contains correctly reported that 3");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 3");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();

    System.out.println("Trying to include 3 again.");
    try {
      S.include(3);
      System.out.print("include incorrectly failed to throw an");
      System.out.println(" ElementFoundException.");
    } catch (ElementFoundException e) {
      System.out.print("include correctly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();
    
    System.out.println("Including 7.");
    try {
      S.include(7);
      if (S.contains(7)) {
        System.out.print("contains correctly reported that 7");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 7");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();
  
    System.out.println("Checking whether 4 is in this set.");
    if (S.contains(4)) {
      System.out.print("contains incorrectly reported that 4");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 4 is not");
      System.out.println(" in this set.");
    };
    System.out.println();
    
    System.out.println("Attempting to remove nonexistent element 4");
    try {
      S.remove(4);
      System.out.print("removed incorrectly failed to throw a");
      System.out.println(" NoSuchElementException.");
    } catch (NoSuchElementException e) {
      System.out.print("removed correctly threw a");
      System.out.println(" NoSuchElementException.");
    };
    System.out.println();
  
    System.out.println("Including 1.");
    try {
      S.include(1);
      if (S.contains(1)) {
        System.out.print("contains correctly reported that 1");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 1");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();
  
    System.out.println("Including 4.");
    try {
      S.include(4);
      if (S.contains(4)) {
        System.out.print("contains correctly reported that 4");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 4");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();

    System.out.println("Including 6.");
    try {
      S.include(6);
      if (S.contains(6)) {
        System.out.print("contains correctly reported that 6");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 6");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();
    
    System.out.println("Including 9.");
    try {
      S.include(9);
      if (S.contains(9)) {
        System.out.print("contains correctly reported that 9");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 9");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();
 
    System.out.println("Including 2.");
    try {
      S.include(2);
      if (S.contains(2)) {
        System.out.print("contains correctly reported that 2");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 2");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();  

    System.out.println("Including 8.");
    try {
      S.include(8);
      if (S.contains(8)) {
        System.out.print("contains correctly reported that 8");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 8");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();
    
    System.out.println("Checking values in order.");

    if (S.contains(1)) {
      System.out.print("contains correctly reported that 1");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 1");
      System.out.println(" is not in this set.");
    };

    if (S.contains(2)) {
      System.out.print("contains correctly reported that 2");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 2");
      System.out.println(" is not in this set.");
    };

    if (S.contains(3)) {
      System.out.print("contains correctly reported that 3");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 3");
      System.out.println(" is not in this set.");
    };

    if (S.contains(4)) {
      System.out.print("contains correctly reported that 4");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 4");
      System.out.println(" is not in this set.");
    };
    
    if (S.contains(5)) {
      System.out.print("contains correctly reported that 5");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 5");
      System.out.println(" is not in this set.");
    };

    if (S.contains(6)) {
      System.out.print("contains correctly reported that 6");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 6");
      System.out.println(" is not in this set.");
    };

    if (S.contains(7)) {
      System.out.print("contains correctly reported that 7");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 7");
      System.out.println(" is not in this set.");
    };

    if (S.contains(8)) {
      System.out.print("contains correctly reported that 8");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 8");
      System.out.println(" is not in this set.");
    };

    if (S.contains(9)) {
      System.out.print("contains correctly reported that 9");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 9");
      System.out.println(" is not in this set.");
    };
    System.out.println();

    System.out.println("Deleting values for 1, 5, 6 and 9.");
    
    try {
      S.remove(1);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 1");
    };

    try {
      S.remove(5);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 5");
    };

    try {
      S.remove(6);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 6");
    };

    try {
      S.remove(9);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 9");
    };
    
    System.out.println("Checking values in order.");

    if (S.contains(1)) {
      System.out.print("contains incorrectly reported that 1");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 1");
      System.out.println(" is not in this set.");
    };

    if (S.contains(2)) {
      System.out.print("contains correctly reported that 2");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 2");
      System.out.println(" is not in this set.");
    };

    if (S.contains(3)) {
      System.out.print("contains correctly reported that 3");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 3");
      System.out.println(" is not in this set.");
    };

    if (S.contains(4)) {
      System.out.print("contains correctly reported that 4");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 4");
      System.out.println(" is not in this set.");
    };
    
    if (S.contains(5)) {
      System.out.print("contains incorrectly reported that 5");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 5");
      System.out.println(" is not in this set.");
    };

    if (S.contains(6)) {
      System.out.print("contains incorrectly reported that 6");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 6");
      System.out.println(" is not in this set.");
    };

    if (S.contains(7)) {
      System.out.print("contains correctly reported that 7");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 7");
      System.out.println(" is not in this set.");
    };

    if (S.contains(8)) {
      System.out.print("contains correctly reported that 8");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 8");
      System.out.println(" is not in this set.");
    };

    if (S.contains(9)) {
      System.out.print("contains incorrectly reported that 9");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 9");
      System.out.println(" is not in this set.");
    };
    System.out.println();
    
    System.out.println("Including 5 again.");
    try {
      S.include(5);
      if (S.contains(5)) {
        System.out.print("contains correctly reported that 5");
        System.out.println(" now belongs to this set.");
      } else {
        System.out.print("contains incorrectly reported that 5");
        System.out.println(" does not belong to this set.");
      };
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println();

    System.out.println("Checking values in order.");

    if (S.contains(1)) {
      System.out.print("contains incorrectly reported that 1");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 1");
      System.out.println(" is not in this set.");
    };

    if (S.contains(2)) {
      System.out.print("contains correctly reported that 2");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 2");
      System.out.println(" is not in this set.");
    };

    if (S.contains(3)) {
      System.out.print("contains correctly reported that 3");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 3");
      System.out.println(" is not in this set.");
    };

    if (S.contains(4)) {
      System.out.print("contains correctly reported that 4");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 4");
      System.out.println(" is not in this set.");
    };
    
    if (S.contains(5)) {
      System.out.print("contains correctly reported that 5");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 5");
      System.out.println(" is not in this set.");
    };

    if (S.contains(6)) {
      System.out.print("contains incorrectly reported that 6");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 6");
      System.out.println(" is not in this set.");
    };

    if (S.contains(7)) {
      System.out.print("contains correctly reported that 7");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 7");
      System.out.println(" is not in this set.");
    };

    if (S.contains(8)) {
      System.out.print("contains correctly reported that 8");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 8");
      System.out.println(" is not in this set.");
    };

    if (S.contains(9)) {
      System.out.print("contains incorrectly reported that 9");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 9");
      System.out.println(" is not in this set.");
    };
    System.out.println();  
    
    System.out.println("Deleting all keys and values except for 8.");
    
    try {
      S.remove(2);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 2.");
    };
    
    try {
      S.remove(3);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 3.");
    };
    
    try {
      S.remove(4);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 4.");
    };

    try {
      S.remove(5);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 5.");
    };

    try {
      S.remove(7);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 9.");
    };
    System.out.println();
    
    System.out.println("Checking values in order.");
    
    if (S.contains(1)) {
      System.out.print("contains incorrectly reported that 1");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 1");
      System.out.println(" is not in this set.");
    };

    if (S.contains(2)) {
      System.out.print("contains incorrectly reported that 2");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 2");
      System.out.println(" is not in this set.");
    };

    if (S.contains(3)) {
      System.out.print("contains incorrectly reported that 3");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 3");
      System.out.println(" is not in this set.");
    };

    if (S.contains(4)) {
      System.out.print("contains incorrectly reported that 4");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 4");
      System.out.println(" is not in this set.");
    };
    
    if (S.contains(5)) {
      System.out.print("contains incorrectly reported that 5");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 5");
      System.out.println(" is not in this set.");
    };

    if (S.contains(6)) {
      System.out.print("contains incorrectly reported that 6");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 6");
      System.out.println(" is not in this set.");
    };

    if (S.contains(7)) {
      System.out.print("contains incorrectly reported that 7");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 7");
      System.out.println(" is not in this set.");
    };

    if (S.contains(8)) {
      System.out.print("contains correctly reported that 8");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 8");
      System.out.println(" is not in this set.");
    };

    if (S.contains(9)) {
      System.out.print("contains incorrectly reported that 9");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 9");
      System.out.println(" is not in this set.");
    };
    System.out.println();
    
    System.out.println("Removing 8 and reintroducing 2");
    
    try {
      S.remove(8);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.print(" NoSuchELementException when deleting");
      System.out.println(" value for 8.");
    };

    try {
      S.include(2);
    } catch (ElementFoundException e) {
      System.out.print("include incorrectly threw an");
      System.out.println(" ElementFoundException.");
    };
    System.out.println(); 
    
    System.out.println("Checking values in order.");
    
    if (S.contains(1)) {
      System.out.print("contains incorrectly reported that 1");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 1");
      System.out.println(" is not in this set.");
    };

    if (S.contains(2)) {
      System.out.print("contains correctly reported that 2");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains incorrectly reported that 2");
      System.out.println(" is not in this set.");
    };

    if (S.contains(3)) {
      System.out.print("contains incorrectly reported that 3");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 3");
      System.out.println(" is not in this set.");
    };

    if (S.contains(4)) {
      System.out.print("contains incorrectly reported that 4");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 4");
      System.out.println(" is not in this set.");
    };
    
    if (S.contains(5)) {
      System.out.print("contains incorrectly reported that 5");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 5");
      System.out.println(" is not in this set.");
    };

    if (S.contains(6)) {
      System.out.print("contains incorrectly reported that 6");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 6");
      System.out.println(" is not in this set.");
    };

    if (S.contains(7)) {
      System.out.print("contains incorrectly reported that 7");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 7");
      System.out.println(" is not in this set.");
    };

    if (S.contains(8)) {
      System.out.print("contains incorrectly reported that 8");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 8");
      System.out.println(" is not in this set.");
    };

    if (S.contains(9)) {
      System.out.print("contains incorrectly reported that 9");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 9");
      System.out.println(" is not in this set.");
    };    
    System.out.println();

    System.out.println("Removing 2.");
    try {
      S.remove(2);
    } catch (NoSuchElementException e) {
      System.out.println("remove incorrectly threw a");
      System.out.println(" NoSuchELementException when removing 2.");
    };
    System.out.println();
    
    System.out.println("Checking values in order.");
    
    if (S.contains(1)) {
      System.out.print("contains incorrectly reported that 1");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 1");
      System.out.println(" is not in this set.");
    };

    if (S.contains(2)) {
      System.out.print("contains incorrectly reported that 2");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 2");
      System.out.println(" is not in this set.");
    };

    if (S.contains(3)) {
      System.out.print("contains incorrectly reported that 3");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 3");
      System.out.println(" is not in this set.");
    };

    if (S.contains(4)) {
      System.out.print("contains incorrectly reported that 4");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 4");
      System.out.println(" is not in this set.");
    };
    
    if (S.contains(5)) {
      System.out.print("contains incorrectly reported that 5");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 5");
      System.out.println(" is not in this set.");
    };

    if (S.contains(6)) {
      System.out.print("contains incorrectly reported that 6");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 6");
      System.out.println(" is not in this set.");
    };

    if (S.contains(7)) {
      System.out.print("contains incorrectly reported that 7");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 7");
      System.out.println(" is not in this set.");
    };

    if (S.contains(8)) {
      System.out.print("contains incorrectly reported that 8");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 8");
      System.out.println(" is not in this set.");
    };

    if (S.contains(9)) {
      System.out.print("contains incorrectly reported that 9");
      System.out.println(" is in this set.");
    } else {
      System.out.print("contains correctly reported that 9");
      System.out.println(" is not in this set.");
    };
    System.out.println();
    
  }
  
}
