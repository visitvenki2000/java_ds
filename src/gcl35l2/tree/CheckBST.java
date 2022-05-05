package gcl35l2.tree;
/*
 * check left sub tree and right subtree with min and max range......
 * All Left subtree elements  should have less than root
 */
public class CheckBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left =  new Node(6);
		root.left.left .right =  new Node(7);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	public static boolean checkBST(Node root, int min,int max){
		
		if(root==null)
			return true;		
	
		
		return (root.data>=min &&  root.data<=max) && checkBST(root.left,min,root.data)&& checkBST(root.right,root.data,max);
		
		
	}

}
