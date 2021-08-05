package cpsc331.collections;

import java.util.NoSuchElementException;

/**
*
* Provides an implementation of a Stack using a singly linked list:
* <br><br>
*
* All operations require constant time in the worst case.
*
* @author Wayne Eberly
*
*/

public class ListStack<E> implements Stack<E> {

  // ListNode Invariant:
  // a) A stack, whose elements have type E, is represented
  //    a singly linked list, with elements of the stack listed
  //    from newest to oldest - so that each Node stores an
  //    element of the stack, the Node at the head of the list
  //    stores the element at the top of the stack, and the Node
  //    at the the tail of the list stores the element at the bottom
  //    of the stack (if the stack is not empty).
  

  // Implementation of a Node in the singly linked list
  // that represents this Stack
  
  private class Node {
  
    //
    // Node Invariant:
    // a) The value of this Node has type E.
    // b) next is a reference to another Node (possibly null).
  
    // Data Fields:
  
    private E value;
    private Node next;
  
    // Constructor
    //
    // Precondition:
    // a) A value x with type E is provided as input.
    // Postcondition:
    // a) A new Node, whose value is x and such that next is null,
    //    is created - so that the "Node Invariant" is satisfied.
  
    public Node (E x) {
  
      value = x;
      next = null;
  
    }
          
  }
  
  // Data Fields
  
  private Node head;
  private Node tail;
  
  /**
  *
  * Creates a linked list representing an empty stack.
  *
  */
  
  // Constructor
  //
  // Precondition: No conditions are required.
  //
  // Postcondition:
  // a) A representation of an empty stack is created - so that
  //    the List Invariant is satisfied.
  
  public ListStack() {
  
    head = null;
    tail = null;
  
  }
  
  public void push(E x) {
  
    Node newNode = new Node(x);
    
    if (head == null) {
    
      // Stack was empty; should now store a single value
      
      head = newNode;
      tail = newNode;
      
    } else {
    
      // Stack was nonempty; new value should be placed in front
      // of its current head
      
      newNode.next = head;
      head = newNode;
    };
  
  
  }
  
  public E peek() {
  
    if (head != null) {
      return head.value;
    } else {
      throw new NoSuchElementException();
    }
  
  }
  
  public E pop() {
  
    if (head != null) {
    
      // Stack was nonempty; value at head of list should be
      // eventually be returned as output.
      
      E topValue = head.value;
      
      if (head.next != null) {
      
        // Stack originally stored at least two values, so that
        // the node at the head of the list should simply be removed.
        
        head = head.next;
        
      } else {
      
        // Stack originally stored a single value, so that it
        // should be replaced by an empty stack (represented
        // by an empty list).
        
        head = null;
        tail = null;
        
      };
      
      return topValue;
      
    } else {
    
      // Stack was empty, so an exception should be thrown.
      
      throw new NoSuchElementException();
      
    }
    
  }
  
  public boolean isEmpty() {
  
    if (head == null) {
      return true;
    } else {
      return false;
    }
    
  }

}
