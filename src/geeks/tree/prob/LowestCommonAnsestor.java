package geeks.tree.prob;

import geeks.tree.Node;

public class LowestCommonAnsestor {

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
		 
		 TreeLCA tlca = new TreeLCA();
		Node result =  tlca.lca(root, 3, 5);
		if(result!=null)
			System.out.println(result.data);
		 
	}

}
class TreeLCA
{

/* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
	Node lca(Node root, int n1,int n2)
	{
		// Your code here
		
		if(root==null)
			return null;
		
		if(root.data==n1 || root.data==n2) {
			
			return root;
		}
		Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		
		
		if(left!=null && right !=null)
			return root;
		
		if(left!=null)
			return left;
		
		if(right!=null)
			return right;
		
		
		
		return null ;
	}
}