package geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(10);
		
		root.left =  new Node(7);
		
		root.right =  new Node(12);
		
		root.left.left =  new Node(4);
		
		root.left.right =  new Node(6);
		
		root.right.left =  new Node(15);
		
		root.right.right =  new Node(18);
		

		
		TreeTest test = new TreeTest();
		
		/*
		System.out.println("Pre order");
		test.preOrder(root);
		System.out.println(" -");
		System.out.println(" In order");
		test.inOrder(root);
		System.out.println(" -");
		System.out.println("Post order");
		test.postOrder(root);
		
		*/
		System.out.println(" -");
		System.out.println("--------------Level  order-----------");
		test.levelOrder(root);
		
		System.out.println(" -");
		System.out.println("--------------Level  order Line by line-----------");
		
		test.printByLineLevelOrder2(root);
		
		System.out.println(" Heigh-t "+test.getHeight(root));
	}
	
	/*
	 *         10
	 *        7     12
	 *      4  6   15 18    
	 * 
	 * 
	 */
	
	// in order - root left right 
	public void preOrder(Node root) {
		
		
		if(root==null)
			return;
		System.out.print(" - "+root.data+" - ");
		preOrder(root.left);	
		
		preOrder(root.right);
		
		
	}

	public void inOrder(Node root) {
		
		
		if(root==null)
			return;

		inOrder(root.left);	
		System.out.print(" - "+root.data+" - ");
		inOrder(root.right);
		
		
	}
	
	public void postOrder(Node root) {
		
		
		if(root==null)
			return;

		postOrder(root.left);	
		
		postOrder(root.right);
		System.out.print(" - "+root.data+" - ");
		
		
	}
	
	public void levelOrder(Node root) {
		
		if(root==null)
			return;
		
		Queue<Node> treeQ = new LinkedList<>();
		
		treeQ.add(root);
		
		while(treeQ.isEmpty()==false) {
			
			Node temp = treeQ.poll();
			System.out.print(" - "+temp.data+" - ");
			
			if(temp.left!=null)
			treeQ.add(temp.left);
			
			if(temp.right!=null)
				treeQ.add(temp.right);
		}
				
	}
	
	public void printByLineLevelOrder(Node root) {
		
		if(root==null)
			return;
		
		Queue<Node> treeQ = new LinkedList<>();
		
		treeQ.add(root);
		treeQ.add(null);
		
		while(treeQ.size()>1) {
			
			Node temp = treeQ.poll();
			
			if(temp==null) {
				System.out.println(" -  - ");
				treeQ.add(null);
				continue;
			}
			System.out.print(" - "+temp.data+" - ");
			
			if(temp.left!=null)
			treeQ.add(temp.left);
			
			if(temp.right!=null)
				treeQ.add(temp.right);
		}
				
	}
	
	public void printByLineLevelOrder2(Node root) {
		
		if(root==null)
			return;
		
		Queue<Node> treeQ = new LinkedList<>();
		
		treeQ.add(root);
		
		
		while(treeQ.isEmpty()==false) {
			
			int count = treeQ.size();
						
			for(int i=0;i<count;i++) {
			Node temp = treeQ.poll();
		
			System.out.print(" - "+temp.data+" - ");
			
			if(temp.left!=null)
			treeQ.add(temp.left);
			
			if(temp.right!=null)
				treeQ.add(temp.right);
			
			}
			System.out.println(" -");
		}
				
	}

	public int getHeight(Node root) {
		
		
		if(root==null)
			return 0;

		
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
		
		
	}
}

/*

Pre order
 - 10 -  - 7 -  - 4 -  - 6 -  - 12 -  - 15 -  - 18 -  -
 In order
 - 4 -  - 7 -  - 6 -  - 10 -  - 15 -  - 12 -  - 18 -  -
Post order
 - 4 -  - 6 -  - 7 -  - 15 -  - 18 -  - 12 -  - 10 - 

 
 
  -
--------------Level  order-----------
 - 10 -  - 7 -  - 12 -  - 4 -  - 6 -  - 15 -  - 18 -  -
--------------Level  order Line by line-----------
 - 10 -  -  - 
 - 7 -  - 12 -  -  - 
 - 4 -  - 6 -  - 15 -  - 18 - 
 
 
 */
