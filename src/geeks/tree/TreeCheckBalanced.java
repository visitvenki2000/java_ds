package geeks.tree;

public class TreeCheckBalanced {

	public TreeCheckBalanced() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(18);
		
		root.left =  new Node(4);
		
		root.right =  new Node(20);
		
		root.right.left =  new Node(13);
		
		root.right.right =  new Node(70);
		
		//root.right.left =  new Node(11);
		
		//root.right.right.right =  new Node(18);
		

		
		TreeCheckBalanced test = new TreeCheckBalanced();
		int height = test.isBalanced(root);
		if(height==-1)
		System.out.println("is Not balanced  : "+height);
		else System.out.println("is  balanced  : "+height);
		
	}
	


public int isBalanced(Node root) {
		
		
		if(root==null)
			return 0;
		
		int lh = isBalanced(root.left);
		
		if(lh==-1) return -1;
		
		
		int rh = isBalanced(root.right);
		
		if(rh==-1) return -1;
         
		if(Math.abs(rh-lh)>1) return -1;
		
		return Math.max(lh, rh)+1;
		
		
	}
	
}

/*
 *         10
 *        7     12
 *      4  6   15 18 
 *      false    
 *  *         10
 *        7     12
 *      4  8   11 18 
 * 
 */
