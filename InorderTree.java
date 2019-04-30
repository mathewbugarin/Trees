/* This program demonstrates in-order traversal
   Driver program is implemented within the program*/

import java.util.Stack; 
  
public class InorderTree
{
   //node class for left and right child of current node
   //and key
   public static class Node 
   { 
      int data; 
      Node left, right; 
  
      public Node(int item) 
      { 
         data = item; 
         left = right = null; 
      } 
   } 
  
//class to print the traversal in order
   public static class BinaryTree 
   { 
      Node root; 
      void inorder() 
      { 
         if (root == null) 
               return; 
  
  
         Stack<Node> s = new Stack<Node>(); 
         Node curr = root; 
  
         //while loop traverses the tree
         while (curr != null || s.size() > 0) 
         { 
  
            //while loop reaches to the most left node
            while (curr !=  null) 
            { 
                //place pointer to tree node on
                //stack before traversing left subtree
                s.push(curr); 
                curr = curr.left; 
            } 
  
            //current node is null at this point
            curr = s.pop(); 
  
            System.out.print(curr.data + " "); 
  
            //traverse to the right subtree
            curr = curr.right; 
         } 
      }
   }

   //demo
   public static void main(String args[]) 
   { 
      //creates binary tree and input nodes
      BinaryTree tree = new BinaryTree(); 
      tree.root = new Node(1); 
      tree.root.left = new Node(2); 
      tree.root.right = new Node(3); 
      tree.root.left.left = new Node(4); 
      tree.root.left.right = new Node(5); 
      tree.inorder(); 
   }
}  