package cpsc331.collections;

import java.util.NoSuchElementException;

/**
*
* Provides an interface for an unbounded stack whose elements
* are of type E.<br><br>
*
* Stack Invariant: A collection of objects of type E is maintained
* in last-in first-out order: The object that is visible at the
* <i>top</i> of the stack is the object that has most recently
* been pushed onto it, and not yet removed.
*
* @author Wayne Eberly
*
*/

public interface Stack<E> {

  /**
  *
  * Pushes a new entry onto the stack.
  *
  * @param x the object to be pushed onto the stack
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Stack Invariant is satisfied. </li>
  * <li> An element x of type E has been given as input. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Stack Invariant is satisfied. </li>
  * <li> The input object x has been pushed onto the top
  *      of the stack (which is otherwise unchanged). </li>
  * </ol>
  *
  */
  
  void push (E x);
  
  /**
  *
  * Reports the top element of the stack without changing it.
  *
  * @return the element at the top of the stack
  * @throws NoSuchElementException if the stack is empty
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Stack Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Stack invariant is satisfied. </li>
  * <li> The stack is not changed. </li>
  * <li> If the stack was <i>not</i> empty before this operation
  *      then the top element is returned as output. </li>
  * <li> If the stack <i>was</i> empty before this operation then
  *      a NoSuchElementException is thrown. </li>
  * </ol>
  *
  */
  
  E peek ();
  
  /**
  *
  * Removes an element from the top of the stack and reports it.
  *
  * @return the element removed from the stack
  * @throws NoSuchElementException if the stack is already empty
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Stack Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Stack Invariant is satisfied. </li>
  * <li> If the stack was <i>not</i> empty before this operation
  *      then the top element is removed from the stack (which is
  *      otherwise unchanged) and this element is returned as output.
  *      </li>
  * <li> If the stack <i>was</i> empty before this operation then a
  *      NoSuchElementException is thrown and the stack is not
  *      changed. </li>
  * </ol>
  *
  */
  
  E pop();
  
  /**
  *
  * Reports whether the stack is currently empty without changing it.
  *
  * @return true if the stack is empty, and false otherwise
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Stack Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Stack Invariant is satisfied. </li>
  * <li> The stack is not changed. </li>
  * <li> If the stack was empty before this operation then
  *      &ldquo;true&rdquo; is returned as output. </li>
  * <li> If the stack was <i>not</i> empty before this operation
  *      then &ldquo;false&rdquo; is returned as output. </li>
  * </ol>
  *
  */
  
  boolean isEmpty();

}   

