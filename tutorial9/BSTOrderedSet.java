package cpsc331.collections;

import java.util.NoSuchElementException;
import cpsc331.collections.OrderedSet;


public class BSTOrderedSet<E extends Comparable<E>> implements OrderedSet<E>{

  private class BSTNode {

    // Data Fields:

    private E value;
    private BSTNode left;
    private BSTNode right;
    private BSTNode parent;

    // Constructor

    public BSTNode (E v) {

      value = v;
      left = null;
      right = null;
      parent = null;

    }

  }

  // Data Fields

  private BSTNode root;

  /**
  *
  * Constructs an empty BSTOrderedSet<br><br>
  *
  */

  public BSTOrderedSet(){

    root = null;

  }

 
  private E search(E v, BSTNode x) throws NoSuchElementException {
  
    if (x == null) {
    
      throw new
       NoSuchElementException("This value is not in the ordered set.");
    
    } else {
      
      int result = v.compareTo(x.value);
      
      if (result < 0) {
      
        return search(v, x.left);
      
      } else if (result == 0) {
      
        return x.value;
      
      } else {  // v.compareTo(x.value) > 0
      
        return search(v, x.right);
      
      }
    
    }
  
  }
  
  
  
	public boolean contains(E v) {
		try {
			search(v, root);
		}
		catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
  
  

  
  
  public void include (E v) throws ElementFoundException {
  
    if (root == null) {
    
      root = new BSTNode(v);
    
    } else {
    
      change(v, root);
    
    }
  
  }
  	
  
  private void change (E v, BSTNode x) throws ElementFoundException{
  
    int result = v.compareTo(x.value);
    
    if (result < 0) {
    
      if (x.left == null) {
      
        BSTNode newNode = new BSTNode(v);
        x.left = newNode;
        newNode.parent = x;
      
      } else {
      
        change(v, x.left);
      
      }
    
    } else if (result == 0) {
    
      throw new ElementFoundException("The element already exists in the ordered set");
    
    } else {   // result > 0
    
      if (x.right == null) {
      
        BSTNode newNode = new BSTNode(v);
        x.right = newNode;
        newNode.parent = x;
      
      } else {  // result > 0
      
        change(v, x.right);
      
      }
    
    }
  
  }
  


  
  private BSTNode successor (BSTNode x) {
  
    BSTNode y = x.right;
       
    while (y.left != null) {
      y = y.left;
    };
    return y;
  
  }


  
  private void deleteNode (BSTNode x) {
  
   if (x.left == null) {
   
     if (x.right == null) {
     
       if (x.parent == null) { //This was the only node
       
         root = null;
     
       } else {  // x should be removed as a child
     
         BSTNode parent = x.parent;
         int result = (x.value).compareTo(parent.value);
         if (result < 0) { // x is a left child
           parent.left = null;
         } else {  // x is a right child
           parent.right = null;
         };
     
       };
   
     } else {
     
       BSTNode rightChild = x.right;
     
       if (x.parent == null) {  // Right child should become root
       
         rightChild.parent = null;
         root = rightChild;
       
       } else {  // Right child should be promoted
       
         BSTNode parent = x.parent;
         int result = (x.value).compareTo(parent.value);
         if (result < 0) { // x is a left child
           parent.left = rightChild;
         } else { // x is a right child
           parent.right = rightChild;
         };
         rightChild.parent = parent;
       
       };
     
     };
     
   } else if (x.right == null) {
   
     BSTNode leftChild = x.left;
     
     if (x.parent == null) {  // Left child should become root
     
       leftChild.parent = null;
       root = leftChild;
       
     } else { // Left child should be promoted
     
       BSTNode parent = x.parent;
       int result = (x.value).compareTo(parent.value);
       if (result < 0) { // x is a left child
         parent.left = leftChild;
       } else {  // x is a right child
         parent.right = leftChild;
       }; 
       leftChild.parent = parent;
           
     };
   
   } else {  // Successor of x should replace x
   
     BSTNode successor = successor(x);
     x.value = successor.value;
     deleteNode(successor);
   
   };
  
  }



   private void deleteFromSubtree(E v, BSTNode x) throws NoSuchElementException {
   
    if (x == null) {
      throw new
      NoSuchElementException("the value is not in this set.");
  
    } else {

      int result = v.compareTo(x.value);
    
      if (result < 0) {
      
        deleteFromSubtree(v, x.left);
      
      } else if (result > 0) {
      
        deleteFromSubtree(v, x.right);
      
      } else { // v is stored at x
      
        deleteNode(x);
        
      }
      
    }
  
  }
  


  public void remove (E v) throws NoSuchElementException {
	deleteFromSubtree(v, root);
}

  
  
  
}
