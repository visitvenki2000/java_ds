package geeks.tree.prob;

import java.util.LinkedList;
import java.util.Queue;

/*
 * FInd max width in tree in any level 
 */
public class MaxWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Node> q= new LinkedList<Node>();
	//	q.rem
		
		//q.add(e)
		
	}

}

class TreeMaxWidth
{
    // /* Function to get the maximum width of a binary tree*/
    int max = Integer.MIN_VALUE;
    int getMaxWidth(Node root)
    {
        // Your code here
        
        Queue<Node> q = new LinkedList<Node>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int count =q.size();
            
            if(count>max)
            max =count;
            for(int i=0;i<count;i++) {
              Node temp = q.remove();
              
              if(temp.left!=null)
              q.add(temp.left);
              
              if(temp.right!=null)
              q.add(temp.right);
            
            }
            
        }
        
        return max;
    }		
}
