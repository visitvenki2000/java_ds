package geeks.tree.prob;

public class CountLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Tested online 
	 */
	
	int countLeaves(Node node) 
    {
         // Your code  
         int count =0;
         if(node==null)
         return 0;
         
         if(node.left==null && node.right==null) {
            return 1;
         }else if(node.left!=null && node.right!=null){
             
             return countLeaves(node.left)+countLeaves(node.right);
         }else if(node.left!=null){
            return countLeaves(node.left);
         }else if(node.right!=null){
            return countLeaves(node.right);
         }else{
             return 0;
         }
         
    }

}
