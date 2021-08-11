package geeks.Double;

public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleLinkedList list = new DoubleLinkedList();
		
		Node head = list.insertAtbegin(null, 10);
		
		head = list.insertAtbegin(head, 20);
		
		 head = list.insertAtbegin(head, 30);
		head =list.insertAtbegin(head, 40);
		
		list.print(head);
		
		head = list.reverse(head);
		System.out.println("---------reverse ");
		
		list.print(head);
	
	}
	
	
	public void print(Node head) {
		
		Node curr = head;
		while(curr!=null) {
		System.out.print(curr.data +" --> ");
		curr = curr.next;
		}
	}
	
	
	
	public Node insertAtbegin(Node head, int data){
		Node temp = new Node(data);
		if(head==null)
			return temp;
		
		temp.next= head;
		head.prev = temp;
		return temp;
		
		
	}
	
	public Node reverse(Node head) {
		
		if(head==null || head.next ==null)
			return head;
		
		Node curr = head;
		while(curr.next!=null) {
			Node temp = curr;
			curr = curr.next;
			temp.next = temp.prev;
			temp.prev = curr;
	
		}
		curr.next = curr.prev;
		
		return curr;
	}

}


class Node {
	
	Node prev;
	Node next;
	int data;
	Node(int data){
		
		this.data = data;
	}
	

}
