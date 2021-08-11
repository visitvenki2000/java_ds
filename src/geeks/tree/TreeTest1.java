package geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Node root = new Node(10);
		
		root.left =  new Node(7);
		
		root.right =  new Node(12);
		
		root.left.left =  new Node(4);
		
		root.left.right =  new Node(8);
		
		root.right.left =  new Node(11);
		
		root.right.right =  new Node(18);
		
		System.out.println("Post order ----------");
		postOrder(root);
		
		System.out.println("Level  order ----------");
		
		levelOrder(root);
	}
	// In  Order - left., cent, right 
	public static void InOrder(Node root) {
		
		
		if(root==null)
			return;
		
		InOrder(root.left);
		System.out.println(root.data);
		InOrder(root.right);
		
		
	}
	
	// pre Order - left., cent, right 
	public static void preOrder(Node root) {
		if(root==null)
			return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(Node root) {
		if(root==null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	public static void levelOrder(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		if(root==null)
			return;
		q.add(root);
		int counter =0;
		while(!q.isEmpty()) {
			 counter = q.size();
				System.out.println(" ");
			 for(int i=0;i<counter;i++) {
			Node temp = q.poll();
			
			System.out.print(" "+temp.data);
			if(temp.left!=null)q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);
			 }
			
		}
	}


}
