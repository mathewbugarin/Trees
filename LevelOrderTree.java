/* This program demonstrates level order traversal
   Driver program is implemented within the program*/
   
public class LevelOrderTree
{
   //node class for left and right of current node
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

   //binary tree class  
   public static class BinaryTree 
   { 
      //root of binary tree
      Node root; 
  
      public BinaryTree() 
      { 
         root = null; 
      } 

      //function prints level order traversal
      public void printLevelOrder() 
      { 
         int h = height(root); 
         int i; 
         for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
      } 
  
      //calculates height of the tree
      int height(Node root) 
      { 
         if (root == null) 
            return 0; 
         else
         { 
            //calculates height of each subtree
            int lheight = height(root.left); 
            int rheight = height(root.right); 
              
            //returns the larger subtree
            if (lheight > rheight) 
                return(lheight+1); 
            else 
                return(rheight+1);  
         } 
      } 

      //prints nodes at given level
      public void printGivenLevel (Node root ,int level) 
      { 
         if (root == null) 
            return; 
         if (level == 1) 
            System.out.print(root.data + " "); 
         else if (level > 1) 
         { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
         } 
      }
   } 
      
   //demo
   public static void main(String args[]) 
   { 
      BinaryTree tree = new BinaryTree(); 
      tree.root= new Node(1); 
      tree.root.left= new Node(2); 
      tree.root.right= new Node(3); 
      tree.root.left.left= new Node(4); 
      tree.root.left.right= new Node(5); 
         
      tree.printLevelOrder(); 
   } 
} 