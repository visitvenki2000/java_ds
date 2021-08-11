package geeks.bst.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class BSTDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node root = new Node(10);	
		root.left =  new Node(20);	
		root.right =  new Node(30);	
		root.left.left =  new Node(5);	
		root.left.right =  new Node(15);	
		//root.left.right =  new Node(40);	
		StringBuffer bf;
		//BSTLevelOrder.levelOrder(root);
		
		//delete(root,50);
		//Node temp = floorNonRec(root,65);
		//Node temp = ceilNonRec(root,35);
		//if(temp!=null)
		//System.out.println(""+temp.data);
		//BSTLevelOrder.levelOrder(root);
		//root.right.left.right =  new Node(9);
		//System.out.println("pairsum "+isPairSum(root, 150));
		////verticalSum(root, hm,0);
		System.out.println("vertical ");
		
		Set<Integer> entry = hm.keySet();
		//List list = new ArrayList(entry);
		//Collections.sort(list);
		Iterator it = entry.iterator();
		
		while(it.hasNext()) {
		Integer temp = (Integer)it.next();
		Integer val = hm.get(temp);
		System.out.println(temp+" - "+val);
			
		}
		verticalTraversal(root);
		
		for(Map.Entry sum:hm.entrySet()) {
			
			System.out.println(sum.getKey()+" - "+sum.getValue());
			
			
			
		}
	}

	//  50
//   30     70
//     40  60  80
	
	public static TreeMap<Integer,Integer> hm = new TreeMap<>();
	
	
	public static void verticalSum(Node root, TreeMap<Integer,Integer> hm,int index) {
		
		if(root==null)
			return ;
		
		if (hm.get(index)!=null) {
			Integer sum = hm.get(index);
			hm.put(index, sum+root.data);			
		}else {
			hm.put(index, root.data);	
		}
		verticalSum(root.left,hm,index-1);
		verticalSum(root.right,hm,index+1);
		
	}
	public static boolean isPairSum(Node root, int sum) {
		
		if(root==null)
			return false;
		
		if (hm.get(root.data)!=null) {
			
			return true;
		}else {
			
			hm.put(sum-root.data, root.data);
			return isPairSum(root.left,sum) || isPairSum(root.right, sum);
		}
		
		
	}
	public static Node  delete(Node root, int key) {
		
		if(root==null)
			return null;
		
		if(key<root.data) {
			root.left =delete(root.left,key);
			
		}else if(key>root.data) {
			root.right =delete(root.left,key);
			
		}else {
			System.out.println(" ch1  ");
			// 
			if(root.left==null && root.right==null)
				return null;
			System.out.println(" ch 2  ");
			if(root.left==null) return root.right;
			
			System.out.println(" ch3  ");
			if(root.right==null) return root.left;
			
			Node succ = getSuccessor(root);
			System.out.println(" successor "+succ.data);
			root.data = succ.data;
			delete(root.right,succ.data); // call delete on successor .....
			
		}
		
		return root;
	}
	public static Node getSuccessor(Node root) {
		
		Node current = root.right;
		
		while(current!=null && current.left!=null) {
			current =current.left;
		}
		return current;
		
	}
	static Node floor;
	public static Node floor(Node root, int key) {
		
		
		if (root==null)
			return null;
		
		if(root.data==key)
		{
			return root;
		}else if(root.data<key) {
			if(floor==null)
			floor = root;
			else if(root.data>floor.data)
			floor = root;
			floor(root.right,key);
			
		}else {
			
			floor(root.left,key);
		}
		
		return null;	
		
	}

	public static Node floorNonRec(Node root, int key) {

		Node result = null;
		if (root == null)
			return null;

		if (root.data == key) {
			return root;
		}
		Node curr = root;
		while (curr != null) {
			if (curr.data == key) {
				result = curr;
				break;
			}

			if (curr.data < key) {
		
				result = curr;
			
				curr = curr.right;
			} else {

				curr = curr.left;
			}

		}
		return result;
	}
	public static Node ceilNonRec(Node root, int key) {

		Node result = null;
		if (root == null)
			return null;


		Node curr = root;
		while (curr != null) {
			if (curr.data == key) {
				result = curr;
				break;
			}

			if (curr.data > key) {
		
				result = curr;
			
				curr = curr.left;
			} else {

				curr = curr.right;
			}

		}
		return result;
	}

	public static  void verticalTraversal(Node root) {
		
		// iterative... 			
		  TreeMap<Integer,ArrayList<Node>> map = new TreeMap<Integer,ArrayList<Node>>();		  
		  Queue<Pair> q = new LinkedList<Pair>();
		  q.add(new Pair(root,0));
		  
		  System.out.println(" verticalTraversal  ");
		  while(!q.isEmpty()) {
			  
			  Pair p = q.poll();
			  
			 if( map.get(p.hd)!=null) {
				 // update list
				 ArrayList<Node> list = map.get(p.hd);
				 list.add(p.node);
			 }else {
				 // create Array list and add 
				 ArrayList<Node> list = new ArrayList<Node>();
				 list.add(p.node);
				 map.put(p.hd, list);
				  
					System.out.println(" added  "+p.hd);
			 }
			 
		
			 if(p.node.left!=null)
				 q.add(new Pair(p.node.left,p.hd-1));
			 if(p.node.right!=null)
				 q.add(new Pair(p.node.right,p.hd+1));
			  
			  
		  }
		  
			System.out.println(" ch 1  ");
			for(Map.Entry sum:map.entrySet()) {
				
				ArrayList<Node> list =  (ArrayList<Node>) sum.getValue(); 
				for(Node n:list) {
				
				System.out.print(" - "+n.data);
				}
				System.out.println(" - ");
			}
		
	}
	
	
		
	
}


