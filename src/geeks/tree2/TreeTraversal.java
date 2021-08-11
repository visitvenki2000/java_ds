package geeks.tree2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

	static public Node prev;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node root = new Node(20);
		//System.out.println(" "+isChildrenSum(root));
		root.left = new Node(12);
		root.right = new Node(8);
		
		root.right.left = new Node(3);
		root.right.right = new Node(5);
		//root.right.right.right = new Node(60);
		
		//inOrderDLL(root);
		spiralLevel(root);
		System.out.println(" ");
		//postOrder(root);
		//System.out.println(" "+height(root));
		//level(root,2);
		//System.out.println(" "+isChildrenSum(root));
		
		//if(isBalanced(root)!=-1)
			//System.out.println(" Balanced");
		//else 
			//System.out.println(" Not balanced");
		
		
	}
	/*
	 * 
	 *   20
	 * 12 8
	 *   3 5 
	 */
	public static void inOrder(Node root) {
		
		
		if(root==null)
			return;
		
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
		
		
	}
	
	public static Node inOrderDLL(Node root) {

		if (root == null)
			return null;

		Node head = inOrderDLL(root.left);

		if (prev == null) {

			head = root;
		} else {

			prev.right = root;
			root.left = prev;

		}

		prev = root;

		inOrderDLL(root.right);

		return head;

	}
	
	
public static void preOrder(Node root) {
		
		
		if(root==null)
			return;
		System.out.print(" "+root.data);
		preOrder(root.left);
	
		preOrder(root.right);
		
		
	}

public static void postOrder(Node root) {
	
	
	if(root==null)
		return;
	
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(" "+root.data);

	
	
}

public static int height(Node root) {
	
	
	if(root==null )
		return 0;
	
	
   return 1+ Math.max(height(root.left),height(root.right));

	
	
}
public static void level(Node root, int k) {
	
	
	Queue<Node> q = new LinkedList<Node>();
	
	q.add(root);
	int level =0;
	//System.out.println("Level -- "+level);
	while(!q.isEmpty()) {
		
		Node node  = q.poll();
		if(node!=null) {
			if(k==level)
		System.out.print(" "+node.data);
		
		}
		
		if(q.isEmpty() || node==null) {
			
			level++;
			System.out.println(" ");
			if(node==null)
			q.add(null);
		}
		if(node.left!=null)
		q.add(node.left);
		if(node.right!=null)
		q.add(node.right);
		
	}
	
}

public static void leftViewLevel(Node node) {
	
	
	Queue<Node> q =  new LinkedList<Node>();
	q.add(node);
	
	while (!q.isEmpty()) {
		
		int size = q.size();
		
		for(int i=0;i<size;i++) {
			
			Node temp = q.poll();
			if(i==0)
			System.out.print(" "+temp.data);
			if(temp.left!=null)
			q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			
			
		}
		
	}
	
}
public static boolean isChildrenSum(Node root) {
	
	
	if(root==null)
		return true;
	
	Node leftNode = root.left;
	Node rightNode = root.right;
	boolean result = true;
	
	if(leftNode!=null && rightNode!=null) {
		if((leftNode.data+rightNode.data)!=root.data )
			result =false;
	}else if(leftNode!=null) {
		if(leftNode.data!=root.data )
			result =false;
	}else if(rightNode!=null) {
		if(rightNode.data!=root.data )
			result =false;
	}
	
   return result && isChildrenSum(root.left) && isChildrenSum(root.right);

	
	
}

public static int isBalanced(Node root) {
	
	
	if(root==null )
		return 0;
	int leftHight = isBalanced(root.left);
	int rightHight = isBalanced(root.right);
	
	if (leftHight==-1 || rightHight ==-1)
		return -1;
	  int diff = Math.abs(leftHight-rightHight);
	  if(diff>1)
		  return -1;
	
   return 1+ Math.max(leftHight,rightHight);

	
	
}
public static void spiralLevel(Node node) {
	
	
	Queue<Node> q =  new LinkedList<Node>();
	q.add(node);
  boolean reverse = false;
  Stack<Node> st = new Stack<Node>();
	while (!q.isEmpty()) {
		
		int size = q.size();
		
		for(int i=0;i<size;i++) {
			
			Node temp = q.poll();
			
			if(reverse) {
				st.push(temp);
			}else {
			System.out.print(" "+temp.data);
			}
			
			if(temp.left!=null)
			q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			
			
		}
		if(reverse)
			reverse=false;
		else
			reverse=true;
		while (!st.isEmpty()) {
		   Node temp = st.pop();
			System.out.print(" "+temp.data);
		}
		
	}
	
}



}
