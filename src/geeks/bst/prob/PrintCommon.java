package geeks.bst.prob;

import java.util.Stack;

import geeks.tree.Node;

public class PrintCommon {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Node root = new Node(5);	
	root.left =  new Node(1);	
	root.right =  new Node(10);	
	root.left.left =  new Node(0);	
	root.left.right =  new Node(4);	
	root.right.left =  new Node(7);	
	root.right.left.right =  new Node(9);
	
	Node root2 = new Node(10);	
	root2.left =  new Node(7);	
	root2.right =  new Node(20);	
	root2.left.left =  new Node(4);	
	root2.left.right =  new Node(9);	

	
	BSTPrintCommon bst = new BSTPrintCommon();
	bst.printCommon(root, root2);
	
	
	
}
	

}


class BSTPrintCommon
{
	public void printCommon(Node root1,Node root2)
         {
         //add code here.
         Stack<Node> st1 = new Stack<Node>();
         Stack<Node> st2 = new Stack<Node>();
         
         inOrder(root1,st1);
         inOrder(root2,st2);
         
         System.out.println("Prepared stack  "+st1.size());
         while(!st1.isEmpty() && !st2.isEmpty()){
             
             Node temp1 = st1.peek();
              Node temp2 = st2.peek();
              
             // System.out.println("data temp1  "+temp1.data);
              if(temp1.data==temp2.data) {
              System.out.print(temp1.data+" "); // print element 
              st1.pop(); st2.pop();
              }
              else if(temp1.data>temp2.data)
               st1.pop();
               else 
               st2.pop();
         }

         
         }
         public void inOrder(Node root, Stack<Node> st){
             
             if(root==null)
             return;
             if(root.left!=null)
             inOrder(root.left,st);
             st.add(root);
             inOrder(root.right,st);
             
         }
}
