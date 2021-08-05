package cpsc331.collections;

/**
*
* Implements a key-value pair of keys with type&nbsp;K and values with
* type&nbsp;V
* <br><br>
*
* KeyValuePair Invariant:<br>
* <ol style="list-style-type: lower-alpha">
* <li> key has type K </li>
* <li> value has type V </li>
* </ol>
*
*/


public class KeyValuePair<K, V> {

 //  Data Fields

  private K key;
  private V value;

  /**
  *
  * Constructs a key-value pair such that the key and value are both null.
  *
  */

  public KeyValuePair () {
    key = null;
    value = null;
  }

  /**
  *
  * Reports the key of this KeyValuePair.
  * <br>
  *
  * @return the key of this KeyValuePair
  *
  */

  public K getKey() {
    return key;
  }

  /**
  *
  * Sets the key to be the input received.
  * <br>
  *
  * @param k the new key to be stored in this KeyValuePair
  *
  */

  public void setKey (K k) {
    key = k;
  }

  /**
  *
  * Reports the value of this KeyValuePair.
  * <br>
  *
  * @return the value of this KeyValuePair
  *
  */

  public V getValue() {
    return value;
  }

  /**
  *
  * Sets the value to be the input received.
  * <br>
  *
  * @param v the new value to be stored in this KeyValuePair
  *
  */

  public void setValue (V v) {
    value = v;
  }

  /**
  *
  * Implements a test for equality, based on key values.
  * <br><br>
  *
  * @param pair the key-value pair whose key is to be compared to this one&rsquo;s
  * @return true if the input KeyValuePair stores the same key as this one,
  *     and false otherwise.
  *
  */

  public boolean equals (KeyValuePair<K, V> pair) {
    return key.equals(pair.key);
  }

}
