package tuf.l1;


public class ReverseLinkedListInGroup {

	Node head;
	public ReverseLinkedListInGroup() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReverseLinkedListInGroup list = new ReverseLinkedListInGroup();
		
	
		
		
		list.insert(8);
		list.insert(7);
		list.insert(6);
	
		list.insert(5);
		list.insert(4);
		
		list.insert(3);
	
		list.insert(2);
		list.insert(1);
		
		list.traverse();
		list.head =list.reverseGoup(list.head, 3);
		
		  System.out.println(" done -----output ");
		list.traverse();
		
		
	

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
	
	public Node reverseGoup(Node head,int k) {
		
		
		if(head==null || head.next==null)
			return head;
		Node dummy = new Node(0);
		dummy.next = head;
		
		Node prev =dummy;
		Node next = dummy;
		Node curr = dummy;
		
		int count =0;
		
		while( curr.next !=null) {
			curr = curr.next;
			count++;
		}
	

		while(count>=k) {
			
			  System.out.println("---------- Outer loop start ---------- ");
		      curr = prev.next;  // curr 1
		      next= curr.next;  // next 2
			
			for (int i=1;i<k ;i++) {
				
				  System.out.println(curr.data +" -> ");
				   curr.next = next.next;  // 1 > 3
				next.next =prev.next;			// 2 > 1	
				prev.next = next;				//dummy.next > 2  , sec loop dummy.next= 3 ;;; stop
				next = curr.next;	   // next = 3
			}
			prev =curr;     //  dummy looses prev track.. assign to current
			
			 System.out.println(" curr ---------- "+curr.data);
			count -= k; 
			
			 System.out.println(" dummy next value ---------- "+dummy.next.data);
			 System.out.println(" prev  value ---------- "+prev.data);
			 
			  System.out.println("---------- Outer loop end ---------- ");
		
		}
	
		
		return dummy.next;
	}

}


class Node {
	
	public int  data;
	public Node next;
	
	Node(int data){
		this.data = data;
		
	}
	
}
