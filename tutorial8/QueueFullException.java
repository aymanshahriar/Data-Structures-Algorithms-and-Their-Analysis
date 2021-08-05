package cpsc331.collections;

/**
* Exception to be thrown if a BoundedQueue is full and an attempt
* is made to insert another element onto it
*
*/

public class QueueFullException extends Exception {

 /**
 * Constructs a QueueFullException with the specified
 * message.
 */

 QueueFullException(String message) {
  super(message);
 };

}

