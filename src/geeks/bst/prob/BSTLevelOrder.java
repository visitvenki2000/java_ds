package geeks.bst.prob;

import java.util.LinkedList;
import java.util.Queue;

public class BSTLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String>  q = new  LinkedList<String>();
	//	q.rem
		
	}

	
	public static void levelOrder(Node root)
	{
	    if(root==null)
	    return;
	    //Your code here
	    //Level order traversal is traversing level by level, left to right
	    
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(root);
	    
	    while(!q.isEmpty()){
	        
	        Node temp = q.poll();
	        System.out.print(temp.data+" ");
	        if(temp.left!=null)
	         q.add(temp.left);
	           if(temp.right!=null)
	         q.add(temp.right);
	        
	        
	    }
	    
	    
	}
}
