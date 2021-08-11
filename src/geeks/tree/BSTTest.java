package geeks.tree;

public class BSTTest {

	
	public int previous =Integer.MIN_VALUE;
	public BSTTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(10);
		
		root.left =  new Node(7);
		
		root.right =  new Node(12);
		
		root.left.left =  new Node(4);
		
		root.left.right =  new Node(8);
		
		root.right.left =  new Node(11);
		
		root.right.right =  new Node(18);
		

		
		BSTTest test = new BSTTest();
		System.out.println("isBST : "+test.isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
		
		System.out.println("isBST2 : "+test.isBst2(root));
		
	}
	
	public boolean isBST(Node root, int min, int max) {
		
		if(root==null)
			return true;
		
		
	  return (root.data>min && root.data<max && isBST(root.left,min,root.data) && isBST(root.right,root.data,max));
	}
	
	// in order travel - check if next element is greater .... use previous variable 
	

	public boolean isBst2(Node root) {
		
		// base condition 
		
		if(root==null)
			return true;
		
		if(!isBst2(root.left)) return false; 
		
		
		if(root.data<=previous) return false;
		
		previous = root.data;
		
		return isBst2(root.right);
		
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
