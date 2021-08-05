package cpsc331.assignment3;

import cpsc331.assignment3.Array;
import cpsc331.collections.HeapFullException;
import java.lang.Math;
import java.util.NoSuchElementException;

/**
* This program provides a method called sort that uses an implementation
* of Heap Sort to sort a given Array in nondecreasing order.
*
* The length of the Array can be greater than or equal to zero.
*
* Author: Ayman Shahriar       UCID: 10180260
*
* Citation (APA format for lecture notes):
* Eberly, W. (2019). Lecture#15: Basic Algorithms for Searching and Sorting
* [Powerpoint Slodes]. Retrieved from http://pages.cpsc.ucalgary.ca/~eberly/Courses/CPSC331/2019a/6_Sorting/L15/L15_basic.pdf
*
* Eberly, W. (2019). Lecture#17: Binary Heaps
* [Powerpoint Slodes]. Retrieved from http://pages.cpsc.ucalgary.ca/~eberly/Courses/CPSC331/2019a/6_Sorting/L17/L17_binary_heaps.pdf
*
* * Eberly, W. (2019). Lecture#18: Applications of Binary Heaps
* [Powerpoint Slodes]. Retrieved from http://pages.cpsc.ucalgary.ca/~eberly/Courses/CPSC331/2019a/6_Sorting/L18/L18_heap_applications.pdf
*/

public class ArrayUtils<T extends Comparable<T>> {
  // global variables
  int heapSize = 0;     // the size of the heap
  Array<T> A;      // the array to be sorted

  /**
  * This is a method that implements Heap Sort to solve the "Sorting" computational problem
  *
  * @param Arr the Array whose entries will be sorted in nondecreasing order by this method
  *
  * Precondition:
  *   a) An array of length n > 0, storing elements of some ordered type T is given as input.
  *
  * Postcondition:
  *   a) The array A has been reordered
  *   b) A[i] <= A[i+1] for every integer i such that 0 ≤ i ≤ A.length-2 .
  *   In other words, the Array A is now sorted in nondecreasing order
  *
  * Loop invariant for first loop:
  * a) An array A with positive length, storing values from an ordered type T, has been given as input.
  * b) The entries of A have been reordered but are otherwise unchanged.
  * c) i is an integer variable such that 1 ≤ i ≤ A.length .
  * d) A represents a Maxheap with size i .
  *
  * Bound function for the first loop: A.length() − i
  *
  * Loop invariant for second loop:
  *  a) An array A with positive length, storing values from an ordered type T , has been given as input.
  * b) The entries of A have been reordered but are otherwise unchanged.
  * c) i is an integer variable such that 0 ≤ i ≤ A.length − 1.
  * d) A represents a Maxheap with size i + 1.
  * e) If i ≤ A.length − 2 then A[h] ≤ A[i+1] for every integer h such that 0 ≤ h ≤ i .
  * f) A[h] ≤ A[h+1] for every integer h such that i + 1 ≤ h ≤ A.length − 2.
  *
  * Bound Function for Second Loop: i
  *
  *
  * Bounds on runtime and storage space:
  *
  * The number of steps used to sort an Array of length n in the worst case is in O(n * log n)
  *
  * This algorithm sorts the input Array in place, using O(log n) additional storage space
  * (including the size of a call stack whenever a recursive method is being used)
  *
  */
  public void sort( Array<T> Arr ) {
    heapSize = 1;
    A = Arr;
    int i = 1;
    while(i < A.length()) {
      insert(A.get(i));
      i += 1;
    }
    i = A.length() - 1;
    while (i > 0) {
      T largest = deleteMax();
      A.set(i, largest);
      i -= 1;
    }

  };

  /**
  * This method solves a modified verion of the "Insertion into a Bounded MaxHeap" computational problem
  *
  * @param key the element of type T that will be added to the maxHeap
  *
  * Precondition:
  *   a) A Maxheap H , representing a finite multiset S of values from an ordered type T,
  *   and represented by an array A , is accessed and modified as global data.
  *   b) A value key of type T is given as input.
  *
  * Postcondition:
  *   a) If the current size of the MaxHeap is less than the length of the array A
  *   then (another copy of) key is included in the multiset S and the array A, so that the size
  *   of the MaxHeap increases by one.
  *   b) Otherwise, neither the multi-set S, array A or the MaxHeap are changed.
  *
  * The only difference between the original verion and the modified version is that the original
  * version throws a HeapFullException, if the length of the Array A is greater than or equal to the
  * size of the MaxHeap, while the modified version does nod throw this HeapFullException.
  *
  * Worst case runtime:
  * The number of steps used to execute this algorithm in the worst case is in O(log n),
  * where n = heapSize (the size of the MaxHeap)
  *
  */

  private void insert(T key) {
    if (heapSize < A.length()) {
      int x = heapSize;
      A.set(x, key);
      heapSize += 1;
      bubbleUp(x);
    }

  }

  /**
  * This method solves the "Maxheap Restoration After Insertion" computational problem
  * @param x an integer index of Array A
  *
  * Precondition:
  * a) A binary tree H with positive size, whose nodes store values from some ordered
  * type T is represented using an array A — and is accessed and modified as global data.
  * b) x is an integer of an index in array A, whose entry represents an input node in H .
  * c) For every node y in H except for the node represented at x , if y is not the root (so that y has a parent),
  * then the value stored at y is less than or equal to the value stored at the parent of y .
  * Furthermore, if the parent of y also has a parent (the“grandparent” of y ) then the
  * value stored at y is less than or equal to the value stored at the grandparent of y .
  *
  * Postcondition:
  * a) The values at the nodes in H may have been exchanged between nodes but
  * are otherwise unchanged. Thus the multiset S represented by H is unchanged.
  * b) H is a Maxheap.
  *
  * Bound Function: x
  *
  * Worst case runtime:
  * The number of steps used to execute this algorithm in the worst case is in O(log n),
  * where n = heapSize (the size of the MaxHeap)
  *
  */

  private void bubbleUp(int x) {
    double n = Math.floor((x - 1) / 2);
    int parentx = (int) n;

    if ((x > 0) && (A.get(x).compareTo(A.get(parentx)) > 0)) {
        T temp = A.get(x);
        A.set(x, A.get(parentx));
        A.set(parentx, temp);
        bubbleUp(parentx);
    }
  }


  /**
  * This method solves the "Deletion of Largest Value from a Bounded MaxHeap" computational problem.
  *
  * @return the largest element in the maxheap
  * @throws NoSuchElementException
  *
  * Precondition:
  * a) A MaxHeap H , representing a finite multiset S of values from an ordered
  * type T, and represented by an array A, is accessed and modified as global data.
  *
  * Postcondition:
  * a) If S is not empty then one copy of the largest element in S is returned
  * as output and removed — so that the size of S is decreased by one
  * (and the MaxHeap H and array A are updated accordingly).
  * b) If S is already empty then a NoSuchElementException is thrown and
  * neither S, H nor A are changed.
  *
  */
  private T deleteMax() {
    if (heapSize == 0) {
      throw new NoSuchElementException();
    }
    else {
      T v = A.get(heapSize - 1);
      heapSize -= 1;
      if (heapSize == 0) {
        return v;
      }
      else {
        T key = A.get(0);
        A.set(0, v);
        bubbleDown(0);
        return key;
      }

    }
  }

  /**
  * This method solves the "Maxheap Restoration After Deletion" computational problem.
  *
  * @param x an an integer index of Array A
  *
  * Precondition:
  * a) H is a binary tree with positive size whose nodes store values from some
  * ordered type T (global data that can be accessed and modified) — with the
  * shape of a heap and represented using an array A .
  * b) x is an integer index of A, whose entry represents an input node in H .
  * c) For every node y in H except for the node represented at x , if z is a child of y then the
  * value stored at y is greater than or equal to the value stored at z ,
  * and the value stored at y is greater than or equal to the values stored
  * at any children of z .
  *
  * Postcondition:
  * a) The values at the nodes in H may have been exchanged between nodes
  * but are otherwise unchanged — so that the multiset S represented by
  * H has not been changed.
  * b) H is a Maxheap.
  *
  *
  *
  */
  private void bubbleDown(int x) {
    int leftx = (2*x) + 1;
    int rightx = (2*x) + 2;
    boolean hasleftx = (leftx < heapSize);
    boolean hasrightx = (rightx < heapSize);

    if (hasrightx) {
        if (A.get(leftx).compareTo(A.get(rightx)) >= 0) {
          if (A.get(leftx).compareTo(A.get(x)) > 0) {
            T temp = A.get(leftx);
            A.set(leftx, A.get(x));
            A.set(x, temp);
            bubbleDown(leftx);
          }
        }
        else if (A.get(rightx).compareTo(A.get(x)) > 0) {
          T temp = A.get(rightx);
          A.set(rightx, A.get(x));
          A.set(x, temp);
          bubbleDown(rightx);
        }
    }
    else if (hasleftx) {
      if (A.get(leftx).compareTo(A.get(x)) > 0) {
        T temp = A.get(leftx);
        A.set(leftx, A.get(x));
        A.set(x, temp);
        bubbleDown(leftx);
      }
    }


  }





































}
