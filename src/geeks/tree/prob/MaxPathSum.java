package geeks.tree.prob;

import geeks.tree.Node;

public class MaxPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(0);
		
		root.left =  new Node(1);
		
		root.right =  new Node(2);
		
		//root.right.left =  new Node(13);
		 root.left.left =  new Node(3);
		 root.left.right =  new Node(4);
		 
		 root.right.left =  new Node(5);
		 root.right.right =  new Node(6);
		 
		//root.right.right =  new Node(70);
		
		TreeMaxPathSum tb = new TreeMaxPathSum();
		System.out.println(tb.maxsum(root));

	}

}
class TreeMaxPathSum
{
   /* Complete the function to get diameter of a binary tree */
   
 public static   int max = Integer.MIN_VALUE;
  public static  int maxsum(Node node)
    {
	  max = Integer.MIN_VALUE; // to avoid increment sum for multiple tcs 
            height(node);

        return max;
        
    }
   public static int height(Node node){
        
       if(node==null)
        return 0;
        
          int lh = height(node.left);
        int rh = height(node.right);
        
         int sum  = lh+rh+node.data;
        if(sum>max)
        max =sum;
         return Math.max(lh,rh)+node.data;
    }

}