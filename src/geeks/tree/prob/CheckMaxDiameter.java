package geeks.tree.prob;

/*
 * Check longest path from one leave to another leave from any node
 * use height calculation LH + RH +1 ....to get dia of any node...
 */
public class CheckMaxDiameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = Integer.MIN_VALUE;
		
	}

}
class TreeMaxDia
{
   /* Complete the function to get diameter of a binary tree */
   
   int max = Integer.MIN_VALUE;
    int diameter(Node node)
    {

            height(node);

        return max;
        
    }
    int height(Node node){
        
       if(node==null)
        return 0;
        
          int lh = height(node.left);
        int rh = height(node.right);
        
         int dia  = lh+rh+1;
        if(dia>max)
        max =dia;
         return Math.max(lh,rh)+1;
    }

}
