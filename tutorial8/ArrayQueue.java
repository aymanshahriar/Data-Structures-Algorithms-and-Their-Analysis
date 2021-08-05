package cpsc331.collections;

import java.util.ArrayList;
import cpsc331.collections.QueueFullException;
import java.util.NoSuchElementException;


public class ArrayQueue<E> implements BoundedQueue<E> {

	// instance variables
	public ArrayList<E> A;
	public int CAPACITY;
	public int size;
	public int front;
	public int rear;


	// deafault constructor
	public ArrayQueue(int capacity) {
		if (capacity > 0) {
			CAPACITY = capacity;
			A = new ArrayList<E>(CAPACITY);
			size = 0;
			front = 0;
			rear = 0;

			for (int i = 0; i < CAPACITY; i++) {
				A.add(null);
			}
		}
		else {
			throw new IllegalArgumentException("Input capacity should be positive");
		}
	}


		
	public void insert(E x) throws QueueFullException {
		if (size < CAPACITY) {
			if (size == 0) {
				A.set(0, x);
				size += 1;
				rear = 0;
			}
			else {
				int index = (rear+1) % CAPACITY;
				A.set(index, x);
				size += 1;
				rear = (rear + 1) % CAPACITY;
			}
		} else {
			throw new QueueFullException("The queue is full");
		}
		System.out.println(A);
	}

	public E remove() {
		if (size == 0) {
			throw new NoSuchElementException();
		} else {
			E element = A.get(front);
			A.set(front, null);
			front = (front + 1) % CAPACITY;
			size -= 1;
			System.out.println(A);
			return element;
		}
	}

	public E peek() {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		
		else {
			System.out.println(A.get(front));
			return A.get(front);
		}	
	
	}


	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
	}


	public int capacity() {
		return CAPACITY;
	}









}
