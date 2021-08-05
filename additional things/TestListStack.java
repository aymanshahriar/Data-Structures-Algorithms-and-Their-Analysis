package cpsc331.collections;

import java.util.NoSuchElementException;
import cpsc331.collections.ListStack;

// A simple class to test the behaviour of ListStack.java

public class TestListStack
{

  public static void main(String[] args) {
  
    System.out.println();
    System.out.println("Creating new ListStack of Integers");
    ListStack<Integer> S = new ListStack<Integer>();
    System.out.println();
    
    System.out.println("Testing behaviour of isEmpty, peek and pop");
    System.out.println();
    
    if (S.isEmpty()) {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      Integer x = S.peek();
      System.out.print("peek incorrectly failed to throw a");
      System.out.println(" NoSuchElementException.");
    }
    catch (NoSuchElementException e) {
      System.out.print("peek correctly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    try {
      Integer x = S.pop();
      System.out.print("pop incorrectly failed to throw a");
      System.out.println(" NoSuchElementException.");
    }
    catch (NoSuchElementException e) {
      System.out.print("pop correctly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Pushing 10 onto the stack.");
    System.out.println();
    S.push(10);
    
    if (S.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      if (S.peek().equals(10)) {
        System.out.print("peek correctly reported that 10 is");
        System.out.println(" on the top of the stack.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Pushing 20 onto the stack.");
    System.out.println();
    S.push(20);
    
    if (S.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      if (S.peek().equals(20)) {
        System.out.print("peek correctly reported that 20 is");
        System.out.println(" on the top of the stack.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Pushing 30 onto the stack.");
    System.out.println();
    S.push(30);
    
    if (S.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      if (S.peek().equals(30)) {
        System.out.print("peek correctly reported that 30 is");
        System.out.println(" on the top of the stack.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Popping 30 off the stack");
    System.out.println();
    
    try {
      if (S.pop().equals(30)) {
        System.out.print("pop correctly reports that 30 was on the");
        System.out.println(" top of the stack.");
      } else {
        System.out.print("pop incorrectly reports that some other");
        System.out.println(" value was on the top of the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("pop incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
    
    if (S.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      if (S.peek().equals(20)) {
        System.out.print("peek correctly reported that 20 is");
        System.out.println(" on the top of the stack.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 20 is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Pushing 40 onto the stack.");
    System.out.println();
    S.push(40);
    
    if (S.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      if (S.peek().equals(40)) {
        System.out.print("peek correctly reported that 40 is");
        System.out.println(" on the top of the stack.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Popping 40 off the stack");
    System.out.println();
    
    try {
      if (S.pop().equals(40)) {
        System.out.print("pop correctly reports that 40 was on the");
        System.out.println(" top of the stack.");
      } else {
        System.out.print("pop incorrectly reports that some other");
        System.out.println(" value was on the top of the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("pop incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
    
    if (S.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      if (S.peek().equals(20)) {
        System.out.print("peek correctly reported that 20 is");
        System.out.println(" on the top of the stack.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 20 is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Popping 20 off the stack");
    System.out.println();
    
    try {
      if (S.pop().equals(20)) {
        System.out.print("pop correctly reports that 20 was on the");
        System.out.println(" top of the stack.");
      } else {
        System.out.print("pop incorrectly reports that some other");
        System.out.println(" value was on the top of the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("pop incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
    
    if (S.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      if (S.peek().equals(10)) {
        System.out.print("peek correctly reported that 10 is");
        System.out.println(" on the top of the stack.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer than 10 is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();
    System.out.println("Popping 10 off the stack");
    System.out.println();
    
    try {
      if (S.pop().equals(10)) {
        System.out.print("pop correctly reports that 10 was on the");
        System.out.println(" top of the stack.");
      } else {
        System.out.print("pop incorrectly reports that some other");
        System.out.println(" value was on the top of the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("pop incorrectly threw a");
      System.out.println("NoSuchElementException.");
    };
    
    if (S.isEmpty()) {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      Integer x = S.peek();
      System.out.print("peek incorrectly failed to throw a");
      System.out.println("NoSuchElementException.");
    } catch (NoSuchElementException e) {
      System.out.print("peek correctly threw a");
      System.out.println(" NoSuchElementException.");
    };

    System.out.println();
    System.out.println("Pushing 50 onto the stack.");
    System.out.println();
    S.push(50);
    
    if (S.isEmpty()) {
      System.out.print("isEmpty incorrectly reported that the stack");
      System.out.println(" is empty.");
    } else {
      System.out.print("isEmpty correctly reported that the stack");
      System.out.println(" is not empty.");
    };
    
    try {
      if (S.peek().equals(50)) {
        System.out.print("peek correctly reported that 50 is");
        System.out.println(" on the top of the stack.");
      } else {
        System.out.print("peek incorrectly reported that some");
        System.out.print(" other integer is on the top of");
        System.out.println(" the stack.");
      };
    } catch (NoSuchElementException e) {
      System.out.print("peek incorrectly threw a");
      System.out.println(" NoSuchElementException.");
    };
    
    System.out.println();

  }

}
