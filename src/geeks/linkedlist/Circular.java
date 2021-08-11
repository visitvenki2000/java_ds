package geeks.linkedlist;

public class Circular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node head = new Node(10);
		head.next =  new Node(20);
		head.next.next =  new Node(30);
		
		Node temp = new Node(40);
		head.next.next.next =  temp;
		temp.next = head;
		Circular list = new Circular();
		list.traverse(head);
		
	}
	
	public void traverse(Node head) {		
	
		if(head==null)
			return;
		
		Node current =head;
		
	
		
		while (current.next!=head) {			
			System.out.print(current.data +" -> ");
			current = current.next;
		}
		System.out.print(current.data);
	}

}
