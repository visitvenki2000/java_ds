package gcl35l2.maths.list;

import list.LinkedListTest1;

public class ListInserMiddle {
	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedListTest1 linked = new LinkedListTest1();
	     linked.insert(10);
		
	
		linked.insert(20);
		linked.insert(30);
		linked.insert(40);
		linked.insert(50);

	}
	
	
	public  Node  insert(int input) {
		
		Node temp = head;
		if(head==null) {
			head = new Node(input);
			return head;
		}
		Node temp2 =new Node(input);
		
		while(temp.next!=null)
			temp=temp.next;
		
		temp.next = temp2;
		return temp;
		
	}

}
