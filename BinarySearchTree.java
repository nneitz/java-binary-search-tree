/*

BinarySearchTree.java

*/

public class BinarySearchTree {

   private Node root;
   private int size;
   public int search = 0;
   public BinarySearchTree() {
      root = null;
      size = 0;
   }
   
   public boolean isEmpty () {
      return root == null;
   }
   
   public void insert(String p) {
      
      size ++;
      //If tree is empty, put object at root
      if ( isEmpty() ) {
         root = new Node(p);
         //check if word is in tree
      } else if (search(p) != null) { 
         //if so, increase frequency
         search(p).incFreq();

      } else {
         insert(new Node(p), root);
      }
      search++;
   }

   private void insert(Node p, Node subroot) {  
      //Determine whether p should go left or right
      if (p.compareTo(subroot.getWord()) <= 0) {
         //check for left child
         if (subroot.getLeftChild() == null) {
            subroot.setLeftChild(p);
         } else {
         //Recursively call insert on the left child
            insert(p, subroot.getLeftChild());
         }
      } else {
         //check for right child
         if (subroot.getRightChild() == null) {
            subroot.setRightChild(p);
         } else {
         //Recursively call insert on the right
            insert(p, subroot.getRightChild());
         }
      }
   }


   public Node search(String c) {
      
         if ( isEmpty() ) 
            return null;
                     
         return search(c, root);      
   }

   
   private Node search(String c, Node subroot) {
      //Check for a match
      if ( c == subroot.getWord() ) {
         if (search >= 30) {
         System.out.println(subroot + ": Frequency: " + subroot.getFreq());
         }
         return subroot;
      } else if (c.compareTo(subroot.getWord()) < 0) {
         
         //Check for left child
         if (subroot.getLeftChild() == null) {
            if (search == 30) {
            System.out.println(c + " not found");
            }
            return null;
         } else {
            return search(c, subroot.getLeftChild());
         }
      } else {
      
         //Check for right child
         if (subroot.getRightChild() == null) {
            if (search == 30) {
            System.out.println(c + " not found");
            }
            return null;        
         } else {
            return search(c, subroot.getRightChild());
         }
      }
   }

   
   public void printPreOrder () {
   
      System.out.println("Running PreOrder Traversal");
      printPreOrder (root);
   }
   
   void printPreOrder (Node subroot){
      if (subroot == null)
         return;
        
      //Print subroot   
      System.out.print ( subroot.getWord () + ", " );
        
      //Left subtree
      printPreOrder ( subroot.getLeftChild () );
        
      //Right subtree
      printPreOrder ( subroot.getRightChild () );
     
   }
   
   public void printInOrder () {
   
      System.out.println ("\n\nRunning InOrder Traversal");
      printInOrder (root);
   }
   
   void printInOrder (Node subroot) {
      if (subroot == null)
         return;
           
      //Left subtree
      printInOrder ( subroot.getLeftChild () );
        
      //Print subroot
      System.out.print ( subroot.getWord () + ", " );
        
      //Right subtree
      printInOrder ( subroot.getRightChild () );
   
   }
    
   public void printPostOrder () {
   
      System.out.println ("\n\nRunning PostOrder Traversal");
      printPostOrder(root);
   }
    
   void printPostOrder (Node subroot) {
      if (subroot == null)
         return;
     
      //Left subtree
      printPostOrder ( subroot.getLeftChild () );
     
      //Right subtree
      printPostOrder ( subroot.getRightChild () );
     
      //Print subroot
      System.out.print ( subroot.getWord() + ", " );   
   }
}