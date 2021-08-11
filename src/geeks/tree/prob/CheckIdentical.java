package geeks.tree.prob;

public class CheckIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	/* 
	 * calculate the size of nodes.... tested online 
	 */
	
	public static int size(Node root){
	    
	    
	    if(root==null)
	    return 0;
	    
	    return 1+size(root.left)+size(root.right);
//add Code here.
}
}

/*
 * Tested in online workng ...
 */
class Tree
{
	/* Should return true if trees with roots as root1 and 
   root2 are identical else false */
        boolean isIdentical(Node root1, Node root2)
	{
		//Your code here
		if(root1==null && root2==null)
		return true;
		if(root1!=null && root2!=null){
		    
		    boolean result = false;
		    if(root1.data==root2.data)
		    result=true;
		    
		    if(result && isIdentical(root1.left,root2.left)&& isIdentical(root1.right,root2.right))
		      return true;
		      else
		      return false;
		    
		}else{
		    
		    return false;
		}
		
	}
	
}