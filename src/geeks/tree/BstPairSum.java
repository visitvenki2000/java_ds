package geeks.tree;

import java.util.HashSet;

public class BstPairSum {

	
	public int previous =Integer.MIN_VALUE;
	public BstPairSum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(10);
		
		root.left =  new Node(5);
		
		root.right =  new Node(20);
		
		//root.left.left =  new Node(4);
		
		//root.left.right =  new Node(8);
		
		root.right.left =  new Node(16);
		
		root.right.right =  new Node(40);
		HashSet<Integer> st = new HashSet<Integer>();
				
		BstPairSum test = new BstPairSum();
		test.pairSum(root, 21, st);
	
		
	}
	
	public boolean pairSum(Node root, int sum, HashSet<Integer> st) {
		
		
		if(root==null)
			return false;
		
		System.out.println("Processsing Pre "+root.data);
		
		if( pairSum(root.left,sum,st)==true) 
			return true;
		
		System.out.println("Processsing in  "+root.data);
		
		if(st.contains(sum-root.data)==true) {
			// found pair
			System.out.println("Found pair"+root.data);
			System.out.println("Found pair second "+(sum-root.data));
			return true;
		}
		else
			st.add(root.data);
		
		return  pairSum(root.right,sum,st);
		
	}
	

}

/*
 *         10
 *        5     20
 *           16 40 
 *      sum 21  
 *  *         10
 *        7     12
 *      4  8   11 18 
 * 
 */
