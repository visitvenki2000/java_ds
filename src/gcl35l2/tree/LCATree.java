package gcl35l2.tree;

import java.util.LinkedList;

public class LCATree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static Node LCA(Node root, Node first, Node second){
		
		if( root.data>=first.data && root.data <=second.data)
			return root;
		
		else if (root.data >first.data && root.data> second.data)
			return LCA(root.left,first,second);
		else return LCA(root.right,first,second);

		
	}
	/*
	public static LinkedList<Node> searchNode(Node root){
		
		
	} */

}
