package cpsc331.collections;

/**
*
* Provides an interface for a hash function that can be used by a hash
* table with open addressing
*
*/

public interface OpenHashFunction<E> {

  /**
  *
  * Reports the hash value for a given value and probe index
  *
  * @param e the element whose has value is to be provided
  * @param i the index of probe for which a has value is being returned
  * @return the hash value for this element
  * <br><br>
  *
  * Precondition: An element e of type&nbsp;E and an integer&nbsp;i, between
  *     one and the size of the hash table being supported, have been given
  *     as input.<br>
  *
  * Postcondition: The hash value for&nbsp;e and&nbsp;i &mdash; an integer between zero
  *     and one less than the size of the hash table being supported &mdash; has
  *     been returned as output.
  *
  */

  public int hashValue (E e, int i);

}
