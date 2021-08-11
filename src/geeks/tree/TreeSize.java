package geeks.tree;

public class TreeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Node root = new Node(10);
		
		root.left =  new Node(7);
		
		root.right =  new Node(12);
		
		root.left.left =  new Node(4);
		
		root.left.right =  new Node(8);
		
		root.right.left =  new Node(11);
		
		root.right.right =  new Node(18);
		
		System.out.println("Sie:"+getSize(root));
		
		System.out.println("max:"+getMax(root));
		
		
		System.out.println("Height:"+getHeight(root));
		

		int isBalanced =isBalanced(root);
		if(isBalanced!=-1)
			System.out.println("Balanced:");
		else 
			System.out.println("Not Balanced:");
	}
	public static int getSize(Node root) {
		
		
		if(root==null)
			return 0;
		
		return 1+getSize(root.left)+getSize(root.right);
		
		
	}
	public static int getMax(Node root) {
		
		if(root==null)
			return Integer.MIN_VALUE;
		
		int lmax = getMax(root.left);
		int rmax = getMax(root.right);
		
		return Math.max(root.data, Math.max(lmax, rmax));
		
		
	}
	
	public static int getHeight(Node root) {
		
		if(root==null)
			return 0;
		
		return 1+Math.max( getHeight(root.left),getHeight(root.right));
		
	}
	// return -1 if any diff is greater than 1 or else height
	public static int isBalanced(Node root) {
		
		
		if(root==null)
			return 0;
		int result=0;
		
		int lh = isBalanced(root.left);
		if(lh==-1)
			result =-1;
		int rh = isBalanced(root.right);
		if(rh==-1)
			result =-1;
		if(result!=-1)
		result = Math.abs(lh-rh)>1?-1:0;
		
		if(result!=-1)
			return 1+ Math.max(lh, rh);
		else 
			return -1;
		
	}

}
