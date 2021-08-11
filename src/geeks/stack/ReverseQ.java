package geeks.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(100);
		ReverseQ revQ = new ReverseQ();
		revQ.reverse(5, q);
		//revQ.reverse(q);
		
	
	}
	public void reverse(int k, Queue<Integer> q) {
		
		Stack<Integer> auxSt = new Stack<Integer>();
		
		System.out.println("Initial "+q);
		
		for(int i=0;i<k;i++) {
			
			auxSt.push(q.poll());
			System.out.println("Adding to Aux : "+auxSt.peek());
		}
			System.out.println("------------------Finised move to Aux q");
		
		// Read from aux q and put back to 
			
			while(auxSt.isEmpty()==false) {
				
				System.out.println("Adding to q back  : "+auxSt.peek());
				q.add(auxSt.pop());
			
			}
			
			System.out.println("After adding aux "+q);
			
			for(int i=0;i<q.size()-k;i++) {
				
				q.add(q.poll());
			
			}
		
			System.out.println("Final "+q);
	}

	

}
