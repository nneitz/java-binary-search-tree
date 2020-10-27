/*

Node.java

*/
public class Node {

   private String word; //word
   private int freq; //frequency of word
   private Node leftChild, rightChild;

   public Node(String p) {
      word = p;
      freq = 1;
      leftChild = rightChild = null;
   }

   public String getWord() {
      return word;
   }
   //getter for word frequency
   public int getFreq() {
      return freq;
   }
   //increments word frequency
   public void incFreq() {
      freq++;
   }

   public Node getLeftChild () {
      return leftChild;
   }

   public Node getRightChild () {
      return rightChild;
   }

   public void setRightChild (Node p) {
      rightChild = p;
   }
   
   public void setLeftChild (Node p) {
      leftChild = p;
   }

   public int compareTo(String p) {
      return word.compareTo(p);
   }
   
   public String toString() {
      return word;
   }
}