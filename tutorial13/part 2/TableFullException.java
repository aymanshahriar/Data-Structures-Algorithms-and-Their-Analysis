package cpsc331.collections;

/**
* Exception to be on an attempt to insert an element into a hash table
* with open addressing when the table is full
*
*/

public class TableFullException extends Exception {

 /**
 * Constructs a TableFullException  with the specified
 * message.
 */

 TableFullException (String message) {
  super(message);
 };

}
