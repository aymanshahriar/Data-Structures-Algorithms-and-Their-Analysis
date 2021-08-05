package cpsc331.collections;

import java.util.NoSuchElementException;

/**
*
* Provides an interface for an unbounded queue whose elements
* are of type E.<br><br>
*
* Queue Invariant: A collection of objects of type E is maintained
* in first-in first-out order: The object that is visible at the
* <i>front</i> of the queue is the object that has was first
* inserted onto it (that has not yet been removed).
*
* @author Wayne Eberly
*
*/

public interface Queue<E> {

  /**
  *
  * Inserts a new object onto the queue.
  *
  * @param x the object to be pushed onto the queue
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Queue Invariant is satisfied. </li>
  * <li> An element x of type E has been given as input. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Queue Invariant is satisfied. </li>
  * <li> The input object x has been inserted at the rear
  *      of the queue (which is otherwise unchanged). </li>
  * </ol>
  *
  */
  
  void insert (E x);
  
  /**
  *
  * Reports the front element of the queue without changing it.
  *
  * @return the element at the front of the queue
  * @throws NoSuchElementException if the queue is empty
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Queue Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Queue invariant is satisfied. </li>
  * <li> The queue is not changed. </li>
  * <li> If the queue was <i>not</i> empty before this operation
  *      then the front element is returned as output. </li>
  * <li> If the queue <i>was</i> empty before this operation then
  *      a NoSuchElementException is thrown. </li>
  * </ol>
  *
  */
  
  E peek ();
  
  /**
  *
  * Removes an element from the front of the stack and reports it.
  *
  * @return the element removed from the queue
  * @throws NoSuchElementException if the queue is already empty
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Queue Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Queue Invariant is satisfied. </li>
  * <li> If the queue was <i>not</i> empty before this operation
  *      then the front element is removed from the queue (which is
  *      otherwise unchanged) and this element is returned as output.
  *      </li>
  * <li> If the queue <i>was</i> empty before this operation then a
  *      NoSuchElementException is thrown and the queue is not
  *      changed. </li>
  * </ol>
  *
  */
  
  E remove();
  
  /**
  *
  * Reports whether the queue is currently empty without changing it.
  *
  * @return true if the queue is empty, and false otherwise
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Queue Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The Queue Invariant is satisfied. </li>
  * <li> The queue is not changed. </li>
  * <li> If the queue was empty before this operation then
  *      &ldquo;true&rdquo; is returned as output. </li>
  * <li> If the queue was <i>not</i> empty before this operation
  *      then &ldquo;false&rdquo; is returned as output. </li>
  * </ol>
  *
  */
  
  boolean isEmpty();

}   

