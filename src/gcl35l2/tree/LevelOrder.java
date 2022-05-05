package gcl35l2.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left =  new Node(6);
		root.left.left .right =  new Node(7);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		levelOrderZigZag(root);
		

	}
	/*
	 *      1
	 *     2  3
	 *    6  4  5
	 *     7 
	 * 
	 */
	//todo in complete
	public static void levelOrderZigZag(Node root){		
		
		Queue<Node>  que = new LinkedList<Node>();	
		  // Deque<Node> que = new LinkedList<Node>();	
		que.add(root);

		boolean flag= true;
		while (!que.isEmpty()){
			
			int size = que.size();
	
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			while (size > 0) {
			
				size--;
			
					
					Node temp = que.poll();
					

					

					//System.out.print(temp.data+" ");
					list.add(temp.data);

					if (temp.left != null)
						que.add(temp.left);
					if (temp.right != null)
						que.add(temp.right);
					
		
			if(flag==true)
				{
				for(Integer t : list){
					
				}System.out.print(temp.data+" ");
				}
			else{
				
				
			}
			

			flag =!flag;
			System.out.println(" ");
			
		}	
		}
		
	}
		
		
		
		public static void levelOrder(Node root){		
			
			Queue<Node>  que = new LinkedList<Node>();	
			que.add(root);
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (!que.isEmpty()){
				int size = que.size();
		   int i=0;
				
				while (size > 0) {
				
					size--;
						Node temp = que.poll();
						if(i==0)
						list.add(temp.data);
						if (temp.left != null)
							que.add(temp.left);
						if (temp.right != null)
							que.add(temp.right);
			}		
			
		}
		}


}
