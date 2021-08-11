package geeks.tree;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node root = insert(null,20);
	//	System.out.println(""+root.data);
		root = insert(root,10);
		
		//System.out.println(""+root.data);
		
		root = insert(root,30);
		System.out.println("---------");
		root = insert(root,40);
		root = insert(root,25);
		root = insert(root,15);
		root = insert(root,12);
		root = insert(root,22);
		root = insert(root,5);
		TreeTest1.levelOrder(root);
		
		System.out.println("---------");
		
		delete(root,10);
		
		TreeTest1.levelOrder(root);

		
	}
	
	public static Node insert(Node root, int value) {
		
		Node result =null;
		
		if(root==null)
			return new Node(value);
		
		if(value<root.data) {
			result = insert(root.left,value);
			root.left = result;
		 return	root ;
				 }
		
		else  {
		
			result = insert(root.right,value); 
			root.right = result;
		return	root;
		}
		
	}

	public static Node delete(Node root, int value) {
		
		
		if(root==null)
			return null;
		if(root.data>value)
			root.left = delete(root.left,value);
		else if(root.data<value)
			root.right = delete(root.right,value);
		else if(root.left==null)
		   return root.right;
		else if(root.right==null)
			return root.left;
		else
		{
			// value equal to ...element to delete  
		Node succ=	getSuccessor(root);
		root.data = succ.data; // change value of current node with successor 
	    root.right= delete(root.right,succ.data);
		}
		return root;

	}
	// get min value of node....in right subtree
	public static Node getSuccessor(Node root) {
		
	
		Node curr = root.right;
		
		while(curr!=null && curr.left!=null)
			curr = curr.left;
		
		return curr;
		
	}	
	
	
}
