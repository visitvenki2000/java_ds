package geeks.tree.prob;

import geeks.tree.Node;

public class CheckBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
		
		root.left =  new Node(2);
		
		root.right =  new Node(3);
		
		//root.right.left =  new Node(13);
		
		//root.right.right =  new Node(70);
		
		TreeBalance tb = new TreeBalance();
		System.out.println(tb.isBalanced(root));

	}

}


class TreeBalance
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
	// Your code here
	
	 int result = checkBalanced(root);
	 if(result==-1)
	 return false;
	 else
	 return true;
	 
    }
    
    int checkBalanced(Node root){
        
        if(root==null)
        return 0;
        
        int leftHeight = checkBalanced(root.left);
        
        if(leftHeight==-1) return -1;
        
        int rightHeight = checkBalanced(root.right);
        
         if(rightHeight==-1) return -1;
         
         if(Math.abs(leftHeight-rightHeight) >1) return -1;
         
         return (Math.max(leftHeight,rightHeight));
        
    }
}