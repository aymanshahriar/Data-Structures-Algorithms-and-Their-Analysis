package cpsc331.collections;

import java.util.NoSuchElementException;
import cpsc331.collections.ListQueue;

// A simple class to test the behaviour of ListQueue.java

public class TestListQueue
{

  public static void main(String[] args) {
  
    System.out.println();
    System.out.println("Creating new ListQueue of Integers");
    ListQueue<Integer> Q = new ListQueue<Integer>();
    System.out.println();
    
    System.out.print("Testing behaviour of isEmpty, insert");
    System.out.println(" and remove.");
    System.out.println();
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      Integer x = Q.peek();
      System.out.print("peek incorrectly failed to throw a");
      System.out.println(" NoSuchElementException.");
    }
    catch (NoSuchElementException e) {
      System.out.print("peek correctly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    try {
      Integer x = Q.remove();
      System.out.print("remove incorrectly failed to throw a");
      System.out.println(" NoSuchElementException.");
    }
    catch (NoSuchElementException e) {
      System.out.print("remove correctly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Inserting 10 onto the queue.");
    System.out.println();
    Q.insert(10);
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(10)) {
        System.out.print("peek correctly reported that 10 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer is on the front of");
        System.out.println(" the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Inserting 20 onto the queue.");
    System.out.println();
    Q.insert(20);
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(10)) {
        System.out.print("peek correctly reported that 10 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 10 at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Inserting 30 onto the queue.");
    System.out.println();
    Q.insert(30);
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(10)) {
        System.out.print("peek correctly reported that 10 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 10 is at the frong");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Removing 10 from the queue.");
    System.out.println();
    
    try {
      if (Q.remove().equals(10)) {
        System.out.print("remove correctly reports that 10 was at the");
        System.out.println(" front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 10 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(20)) {
        System.out.print("peek correctly reported that 20 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 20 is on the front of");
        System.out.println(" the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Inserting 40 onto the queue.");
    System.out.println();
    Q.insert(40);
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(20)) {
        System.out.print("peek correctly reported that 20 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other value than 20 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Removing 20 from the queue");
    System.out.println();
    
    try {
      if (Q.remove().equals(20)) {
        System.out.print("remove correctly reports that 20 was at");
        System.out.println(" the front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 20 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(30)) {
        System.out.print("peek correctly reported that 30 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other value than 30 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Removing 30 from the queue");
    System.out.println();
    
    try {
      if (Q.remove().equals(30)) {
        System.out.print("remove correctly reports that 30 was at");
        System.out.println(" the front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 30 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(40)) {
        System.out.print("peek correctly reported that 40 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other value than 40 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Removing 40 from the queue.");
    System.out.println();
    
    try {
      if (Q.remove().equals(40)) {
        System.out.print("remove correctly reports that 40 was at");
        System.out.println(" the front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 40 was at the front of");
        System.out.println(" the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      Integer x = Q.peek();
      System.out.print("peek incorrectly failed to throw a");
      System.out.println("NoSuchElementException.");
    } catch (NoSuchElementException e) {
      System.out.print("peek correctly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Inserting 50 onto the queue.");
    System.out.println();
    Q.insert(50);
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(50)) {
        System.out.print("peek correctly reported that 50 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other value than 50 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();

  }

}
