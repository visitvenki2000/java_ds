package geeks.linkedlist;

class linkedlist {
	
	Node head;
	public static void main(String [] args) {
	
		linkedlist list = new linkedlist();
		list.insert(30);
		list.insert(20);
		list.insert(10);
		//list.traverse();
		list.traverseR(list.head);
		
	
		list.insertAtEnd(list.head, 40);
		System.out.println("");
		System.out.println("---------");
		list.traverseR(list.head);
		//list.head=	list.deleteAtStart(list.head);
		
		System.out.println("");
		System.out.println("---------After first delete");
		list.traverseR(list.head);
		
		//list.head=	list.deleteAtEnd(list.head);
		
		System.out.println("");
		System.out.println("---------After End delete");
		list.traverseR(list.head);
		
		list.insertAtPos(list.head,2,25);
		
		System.out.println("");
		System.out.println("---------After insert at 2");
		list.traverseR(list.head);
		
		list.insertAtPos(list.head,4,45);
		System.out.println("");
		System.out.println("---------After insert at 4");
		list.traverseR(list.head);
		
		
		list.head = list.insertAtPos(list.head,8,80);
		System.out.println("");
		System.out.println("---------After insert at 8");
		list.traverseR(list.head);
		
		
		list.head = list.insertAtPos(list.head,1,2);
		System.out.println("");
		System.out.println("---------After insert at 1");
		list.traverseR(list.head);
		
		
		
		System.out.println("---------search po "+list.searchRec(list.head, 30));
		
	}
	public void print(Node head) {
		
	}
	
	public  Node insert(int input) {		
		if(head==null) {
			head = new Node(input);
			return head;	
			
		}
		
	 Node temp = new Node(input)	;
	 temp.next = head;
	 head = temp;
	 return temp; //  new node is temp inserted at beginining 			
	}
	public void traverse() {	
		
		Node temp = head;
	  while (temp!=null) {
		  
		  System.out.print(temp.data +" -> ");
		  temp = temp.next;
	  }
		
	}
	
public void traverseR(Node node) {	
		
	if(node==null)
		return;
	System.out.print(""+node.data+" --> ");
	traverseR(node.next);
	
	}
	



public void traverseReReverse(Node node) {	
	
	if(node==null)
		return;

	traverseReReverse(node.next);
	System.out.print(""+node.data+" --> ");
	
	}
	
public  Node insertAtEnd(Node head, int input) {		
	if(head==null) {
		head = new Node(input);
		return head;	
		
	}
	Node curr = head;
	
	while(curr.next!=null) {
		curr =curr.next;
	}
	curr.next =  new Node(input);

 return curr; //  new node is temp inserted at end 	
}

public Node deleteAtStart(Node head) {
	
	if(head==null || head.next==null) 
		return null;	
	Node curr = head.next;	
	return curr;	
}


public Node deleteAtEnd(Node head) {
	
	if(head==null || head.next==null) 
		return null;	
	Node curr = head;	
	while(curr.next.next!=null)
	 curr = curr.next;	
	
	curr.next = null;
	return head;	
}

	public Node insertAtPos(Node head, int pos, int input) {
		if (head == null && pos == 1) {
			head = new Node(input);
			return head;
		}else if(pos == 1) {
			
			Node temp = new Node(input);
			temp.next = head;
			return temp;
		}
		Node curr = head;
		int count = 1;
		;
		while (count < pos-1 && curr.next != null) {

			curr = curr.next;
			count++;
		}
		if (pos == count+1) {
			Node temp = curr.next;
			curr.next = new Node(input);
			curr.next.next = temp;
		}

		return head; //
	}
	
	public int search(Node head, int input) {
		
		
		int count =1;
		
		Node curr = head;
		while(curr!=null && curr.data!=input) {			
			
			curr= curr.next;
			count = count+1;
			
		}
		
		if(curr==null)
			return -1;
		return count;
		
	}
	
	public int searchRec(Node head, int input) {		
	
		if(head==null)
			return -1;		
		
		if(head.data==input)
			return  1;
		else {
			int res = searchRec(head.next,input);
			if(res==-1) return -1;
			else return 1+res;
			
		}
				
	}

}



class Node {
	
	public int  data;
	public Node next;
	
	Node(int data){
		this.data = data;
		
	}
	
}
