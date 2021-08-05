package cpsc331.collections;

import java.util.NoSuchElementException;
import cpsc331.collections.QueueFullException;

/**
*
* Provides an interface for an bounded queue whose elements
* are of type E.<br><br>
*
* BoundedQueue Invariant: A collection of objects of type E is
* maintained in first-in first-out order: The object that is visible
* at the <i>front</i> of the queue is the object that was first
* inserted onto it, and not yet removed. The number of objects
* on the queue is never allowed to exceed this queue's (positive
* integer) capacity.
*
* @author Wayne Eberly
*
*/

public interface BoundedQueue<E> {

  /**
  *
  * Inserts a new entry onto the queue.
  *
  * @param x the object to be inserted onto the queue
  * @throws QueueFullException if the queue is already full
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * <li> An element x of type E has been given as input. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * <li> If the number of objects presently on this bounded queue was
  *      less than the bounded queue's capacity, then the input
  *      object x has been inserted onto the rear of the queue (which
  *      is otherwise unchanged). </li>
  * <li> If the number of objects presently on the bounded queue was
  *      equal to the bounded queue's capacity, then a
  *      QueueFullException is thrown and the queue is not changed.
  *      </li>
  * </ol>
  *
  */
  
  void insert (E x) throws QueueFullException;
  
  /**
  *
  * Reports the element at the front of the queue without changing it.
  *
  * @return the element at the front of the queue
  * @throws NoSuchElementException if the queue is empty
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue invariant is satisfied. </li>
  * <li> The bounded queue is not changed. </li>
  * <li> If the bounded queue was <i>not</i> empty before this
  *      operation then the element at the front is returned as
  *      output. </li>
  * <li> If the bounded queue <i>was</i> empty before this operation
  *      then a NoSuchElementException is thrown. </li>
  * </ol>
  *
  */
  
  E peek ();
  
  /**
  *
  * Removes an element from the front of the queue and reports it.
  *
  * @return the element removed from the queue
  * @throws NoSuchElementException if the queue is already empty
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * <li> If the bounded queue was <i>not</i> empty before this
  *      operation then the element at the front of the queue
  *      (which is otherwise unchanged) is removed and this element
  *      is returned as output. </li>
  * <li> If the bounded queue <i>was</i> empty before this operation
  *      then a NoSuchElementException is thrown and the queue is not
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
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * <li> The bounded queue is not changed. </li>
  * <li> If the bounded queue was empty before this operation then
  *      &ldquo;true&rdquo; is returned as output. </li>
  * <li> If the bounded queue was <i>not</i> empty before this
  *      operation then &ldquo;false&rdquo; is returned as output.
  * </li>
  * </ol>
  *
  */
  
  boolean isEmpty();
  
  /**
  *
  * Reports the capacity of this bounded queue.
  *
  * @return the capacity of this BoundedQueue
  * <br><br>
  *
  * Precondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * </ol>
  * Postcondition:<br>
  * <ol style="list-style-type: lower-alpha">
  * <li> The BoundedQueue Invariant is satisfied. </li>
  * <li> The bounded queue is not changed. </li>
  * <li> The capacity of this bounded queue is returned as output.
  * </li>
  * </ol>
  * 
  */
  
  int capacity();

}

