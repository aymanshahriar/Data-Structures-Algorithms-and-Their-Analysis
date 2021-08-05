package cpsc331.collections;

import java.util.NoSuchElementException;


/**
 * This class implements the abstract data type queue using a linkedList
 * A Node class has also been created to help with this implementation
 *
 * All operations have constant worst case time
 *
 * ListQueue Invariant: A collection of objects of type E is stored in a singly linked list in the order from the oldest
 * inserted to the most recently inserted. Each node stores a single element of the queue
 * The front (oldest added element) of the queue is at the head of the list, while the rear (most recently added element) is at the tail of the list
 *
 */


public class ListQueue<E> implements Queue<E> {

	private class Node {

	//
	// Node invariant:
	// 1) the value of the node is of type E
	// 2) the next variable is of type Node (possibly null)

	// instance variables
	public E value;
	public Node next;

	// constructor
	//
	// Precondition:
	// a) A value x of type E is provided as input
	// Postcondition:
	// a) A new node whose value is x and next is null is created, and
	//    the "Node invariant is satisfied"
	public Node(E x) {
		value = x;
		next = null;
	}

	}

	/**
	 * Instance variables
	 */
	Node head;
	Node tail;



	/**
	 * Constructor that initializes an empty queue
	 *
	 * Precondition: none
	 * Postcondition: an instance of a Queue is created, such that the Queue Invariant is satisfied
	 */
	public ListQueue() {
		head = null;
		tail = null;
	}


	@Override	
	public void insert(E x) {
		Node newest = new Node(x);
		
		if (head == null) {
			head = newest;
			tail = newest;	
		}
		
		else{
			tail.next = newest;
			tail = newest;
		}

	
	}


	public E peek() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		else {
			return head.value;
		}
	}


	public E remove() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		else if (head.next == null){
			Node removedNode = head;
			head = null;
			tail = null;
			return removedNode.value;
		}
		else {
			Node removedNode = head;
			head = head.next;
			return removedNode.value;
		}
	
	}


	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		else {
			return false;
		}

	}









}
