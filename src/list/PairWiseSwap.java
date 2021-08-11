package list;

public class PairWiseSwap {

	Node head =null;
	int size =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node LinkedList;

		PairWiseSwap pair = new PairWiseSwap();
		pair.insert(10);
		pair.insert(20);
		pair.insert(25);
		pair.insert(30);
		pair.insert(40);
		pair.insert(50);
		pair.printList();
		
		pair.pairWiseSwapAll();
		System.out.println("-----------------------Break------------");
		pair.printList();

	
		
		
		/*.delete(30);

		pair.printList();

		pair.delete(40);

		pair.printList();

		pair.delete(10);

		pair.printList(); */

	}
	
	public void insert(int data) {
		
		if(head==null) {
			head=  new Node(data);
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		
		Node temp  =new Node(data);
		current.next= temp;
		
	}
	public void printList() {
		
		Node current = head;
		
		while(current!=null) {
			System.out.println("Data in list "+current.data);
			current =current.next;
		}
	}

	public boolean delete(int data) {
		
		if(head==null)
			return false;
		
		if(head.data ==data)
		{
			head = head.next;
			System.out.println("Head node "+data);
			return true;
		}
		Node current = head;
		Node previous = current;
		while(current!=null) {
			
			if(current.data ==data) {
				System.out.println("Data found Deleting "+data);
				System.out.println("Data found previous "+previous.data);
				previous.next = current.next;
				return true;
			}
			previous = current;
			current = current.next;
		}
		return false;
		
	}
	
	public Node getHead() {
		
		return head;
	}
	/*
	 * 1) previous.next  > current.next
	 * 2) current.next = curent.next.next ;
	 * 3) 
	 * 
	 * 
	 * 
	 */
	
	public boolean pairWiseSwapAll() {
		
		if(head==null || head.next==null)
			return false;
		Node current = head.next.next;
		Node  previous = head;
		
		// handle first node 
		System.out.println("pairWiseSwap a"+current.data);
		System.out.println("pairWiseSwap previous"+previous.data);
		
	
			
			head = head.next;
			head.next = previous;
		
			
			System.out.println("pairWiseSwap a1 "+current.data);
			System.out.println("pairWiseSwap previous 1"+previous.data);
		
		  // prev >> 3rd node ,
			// Next 4th node ?
		
		
		while( current!=null && current.next!=null) {
			System.out.println("pairWiseSwap while loop --- "+current.data);
			System.out.println("pairWiseSwap while loop "+previous.data);
			
		
				// found match swap the elements 
				System.out.println("current a"+current.data);
				System.out.println("previous a"+previous.data);
				
				previous.next = current.next; /// point to 2nd item
				previous = current;  // move prev to changed 2nd element
				Node next = current.next.next; // keep next item pointer 
				
				current.next.next = current; // 2nd point to 1st item 
					
				current.next = next; // point 1st node to next element 
			
			
			
			current = next; // move curr to next element 
			//System.out.println("current last"+current.data);
			System.out.println("previous last"+previous.data);
		}
		
		return true;
	}
	/*
	 * 1) previous.next  > current.next
	 * 2) current.next = curent.next.next ;
	 * 3) 
	 * 
	 * 
	 * 
	 */
	
	public boolean pairWiseSwap(int value1, int value2) {
		
		if(head==null || head.next==null)
			return false;
		Node current = head.next;
		Node  previous = head;
		
		// handle first node 
		System.out.println("pairWiseSwap a"+current.data);
		System.out.println("pairWiseSwap previous"+previous.data);
		
		if(previous.data==value1 && current.data==value2) {
			
			System.out.println("First 2 nodes matched "+head.data);
			System.out.println("First 2 nodes matched "+head.next.data);
			//first 2 nodes match 
			
			head = current;
			previous.next = current.next;
			current.next = previous;
		
		
			return true;
		}
		
		while( current!=null && current.next!=null) {
			System.out.println("pairWiseSwap while loop "+current.data);
			
			if(current.data==value1 && current.next.data==value2) {
				// found match swap the elements 
				System.out.println("current a"+current.data);
				System.out.println("previous a"+previous.data);
				previous.next = current.next; 
				Node next = current.next.next; // keep next item pointer 
				
				current.next.next = current; // point 2nd el ref to current 
				
				current.next = next; // point 1st node to next element 
				return true ;
			}
			
			
			previous = previous .next;
			current = current.next;
		}
		
		return false;
	}

	
}
