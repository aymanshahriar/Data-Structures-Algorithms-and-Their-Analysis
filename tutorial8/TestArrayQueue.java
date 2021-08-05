package cpsc331.collections;

import java.util.NoSuchElementException;
import cpsc331.collections.ArrayQueue;
import cpsc331.collections.QueueFullException;

// A simple class to test the behaviour of ArrayQueue.java
//
// Author: Wayne Eberly

public class TestArrayQueue
{

  public static void main(String[] args) {
  
    System.out.println();
    System.out.print("Creating new ListQueue of Integers");
    System.out.println(" with capacity 4.");
    ArrayQueue<Integer> Q = new ArrayQueue<Integer>(4);
    System.out.println();
    
    if (Q.capacity() == 4) {
     System.out.print("capacity correctly reported that the");
     System.out.println(" capacity of this queue is 4.");
    } else {
      System.out.print("capacity incorrectly reported that the");
      System.out.println(" capacity of the queue is not 4.");
    };
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
    
    try{
      Q.insert(10);
    } catch (QueueFullException e) {
      System.out.print("insert incorrectly reported that");
      System.out.println(" the queue is full.");
    }
    
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
        System.out.print(" other integer is at the front of");
        System.out.println(" the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Inserting 20 onto the queue.");
    System.out.println();
    
    try{
      Q.insert(20);
    } catch (QueueFullException e) {
      System.out.print("insert incorrectly reported that");
      System.out.println(" the queue is full.");
    }
    
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
        System.out.print(" other integer than 10 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Inserting 30 onto the queue.");
    System.out.println();
    
    try {
      Q.insert(30);
    } catch (QueueFullException e) {
      System.out.print("insert incorrectly reported that");
      System.out.println(" the queue is full.");
    }
    
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
        System.out.println(" at the front.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 10 is at the front");
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
        System.out.print("remove correctly reports that 10 was at");
        System.out.println(" the front of the queue.");
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
    System.out.print("Including enough insert and remove operations");
    System.out.print(" to ensure that both front and rear have to");
    System.out.println(" cycle back to zero.");

    System.out.println();
    System.out.println("Inserting 40 onto the queue.");
    System.out.println();
    
    try {
      Q.insert(40);
    } catch (QueueFullException e) {
      System.out.print("insert incorrect reported that");
      System.out.println(" the queue is full.");
    }
    
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
        System.out.print(" other integer than 20 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Removing 20 from the queue.");
    System.out.println();
    
    try {
      if (Q.remove().equals(20)) {
        System.out.print("remove correctly reports that 20 was at the");
        System.out.println(" front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 20 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
 
    System.out.println();
    System.out.println("Inserting 50 onto the queue.");
    System.out.println();
    
    try {
      Q.insert(50);
    } catch (QueueFullException e) {
      System.out.print("insert incorrect reported that");
      System.out.println(" the queue is full.");
    }
    
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
        System.out.print(" other integer than 30 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Removing 30 from the queue.");
    System.out.println();
    
    try {
      if (Q.remove().equals(30)) {
        System.out.print("remove correctly reports that 30 was at the");
        System.out.println(" front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 30 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
   
    System.out.println();
    System.out.println("Inserting 60 onto the queue.");
    System.out.println();
    
    try {
      Q.insert(60);
    } catch (QueueFullException e) {
      System.out.print("insert incorrect reported that");
      System.out.println(" the queue is full.");
    }
    
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
        System.out.print(" other integer than 40 is at the front");
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
        System.out.print("remove correctly reports that 40 was at the");
        System.out.println(" front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 40 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
   
    System.out.println();
    System.out.println("Inserting 70 onto the queue.");
    System.out.println();
    
    try {
      Q.insert(70);
    } catch (QueueFullException e) {
      System.out.print("insert incorrect reported that");
      System.out.println(" the queue is full.");
    }
    
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
        System.out.print(" other integer than 50 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Removing 50 from the queue.");
    System.out.println();
    
    try {
      if (Q.remove().equals(50)) {
        System.out.print("remove correctly reports that 50 was at the");
        System.out.println(" front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 50 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
   
    System.out.println();
    System.out.println("Inserting 80 onto the queue.");
    System.out.println();
    
    try {
      Q.insert(80);
    } catch (QueueFullException e) {
      System.out.print("insert incorrect reported that");
      System.out.println(" the queue is full.");
    }
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(60)) {
        System.out.print("peek correctly reported that 60 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 60 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Removing 60 from the queue.");
    System.out.println();
    
    try {
      if (Q.remove().equals(60)) {
        System.out.print("remove correctly reports that 60 was at the");
        System.out.println(" front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 60 was at the front");
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
      if (Q.peek().equals(70)) {
        System.out.print("peek correctly reported that 70 is");
        System.out.println(" at the top of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 70 is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Removing 70 from the queue.");
    System.out.println();
    
    try {
      if (Q.remove().equals(70)) {
        System.out.print("remove correctly reports that 70 was at");
        System.out.println(" the front of the queue.");
      } else {
        System.out.print("remove incorrectly reports that some other");
        System.out.print(" value than 70 was on at the front");
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
      if (Q.peek().equals(80)) {
        System.out.print("peek correctly reported that 80 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 80 at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Removing 80 from the queue.");
    System.out.println();
    
    try {
      if (Q.remove().equals(80)) {
        System.out.print("remove correctly reports that 80 was at");
        System.out.println(" the front of the queue.");
      } else {
        System.out.print("re,pve incorrectly reports that some other");
        System.out.print(" value than 80 was at the front");
        System.out.println(" of the queue.");
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
    System.out.println("Inserting 90 onto the queue.");
    System.out.println();
    
    try {
      Q.insert(90);
    } catch (QueueFullException e) {
      System.out.print("insert incorrectly reported that");
      System.out.println("the queue is full.");
    };
    
    if (Q.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the queue");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the queue");
      System.out.println(" is not empty.");
    };
    
    try {
      if (Q.peek().equals(90)) {
        System.out.print("peek correctly reported that 90 is");
        System.out.println(" at the front of the queue.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 90 is at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    
    System.out.println("Inserting 100 onto the queue.");
    try {
      Q.insert(100);
    } catch (QueueFullException e) {
      System.out.print("insert incorrectly reported that");
      System.out.println("the queue is full.");
    };
    
    System.out.println("Inserting 110 onto the queue.");
    try {
      Q.insert(110);
    } catch (QueueFullException e) {
      System.out.print("insert incorrectly reported that");
      System.out.println("the queue is full.");
    };
    
    System.out.println("Inserting 120 onto the queue.");
    try {
      Q.insert(120);
    } catch (QueueFullException e) {
      System.out.print("insert incorrectly reported that");
      System.out.println("the queue is full.");
    };
    System.out.println();
    
    System.out.println("Trying to insert 130 onto the queue.");
    try {
      Q.insert(130);
      System.out.print("insert incorrectly failed to throw");
      System.out.println(" a QueueFullException.");
    } catch (QueueFullException e) {
      System.out.print("insert correctly reported that");
      System.out.println(" the queue is already full.");
    }
    System.out.println();
    
    System.out.println("Removing 90 from the queue.");
    try{
      if (Q.remove() != 90) {
        System.out.print("remove incorrectly reported that some");
        System.out.print(" other value than 90 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly reported that the queue");
      System.out.println(" was already empty.");
    };
    
    System.out.println("Removing 100 from the queue.");
    try{
      if (Q.remove() != 100) {
        System.out.print("remove incorrectly reported that some");
        System.out.print(" other value than 100 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly reported that the queue");
      System.out.println(" was already empty.");
    };

    System.out.println("Removing 110 from the queue.");
    try{
      if (Q.remove() != 110) {
        System.out.print("remove incorrectly reported that some");
        System.out.print(" other value than 110 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly reported that the queue");
      System.out.println(" was already empty.");
    };
    
    System.out.println("Removing 120 from the queue.");
    try{
      if (Q.remove() != 120) {
        System.out.print("remove incorrectly reported that some");
        System.out.print(" other value than 120 was at the front");
        System.out.println(" of the queue.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("remove incorrectly reported that the queue");
      System.out.println(" was already empty.");
    };

    if (Q.isEmpty()) {
      System.out.print("isEmpty has now correctly reported that");
      System.out.println(" the queue is empty.");
    } else {
      System.out.print("isEmpty has now incorrectly reported that");
      System.out.println(" the queue is not empty.");
    };
    System.out.println();

  }

}
