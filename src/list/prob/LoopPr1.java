package list.prob;



public class LoopPr1 {

	Node head ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoopPr1 linked = new LoopPr1();
	     linked.insert(10);
		
	
		linked.insert(20);
		Node temp =	linked.insert(30);
	 linked.insert(40);
		Node temp2 =linked.insert(50);
		temp2.next = temp;
		linked.print();
		System.out.println("------------");
		linked.detectLoop();
	
		System.out.println("------------");
		linked.print();

	}
	


public  void print() {
	
	//for(Node temp = head;temp!=null;temp =temp.next)
		//System.out.println(" "+temp.data);
	
	Node temp2 = head;
	int i=0;
	while(temp2!=null ) {
		System.out.println(" while "+temp2.data);
	   temp2=temp2.next	;
	   i++;
	   if(i==30) // to avoid infinite loop 
		   break;
	}
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
		return temp2;
		
	}
	// detec and remove....
	public void detectLoop() {
		
		Node slow = head;
		Node fast = head;
		boolean isLoop =false;
		while( fast!=null && fast.next!=null) {
			
			slow= slow.next;
			fast= fast.next.next;
			
			if(slow==fast) {
				isLoop =true;
				
				System.out.println("Loop found");
				break;
			}
			
		}
		
		// if loop detected move till end and remove the loop
		//imp slow and fast can be anywhere in middle 
		//** reset slow to head and start from bigining .
		
		//System.out.println("in while slow "+slow.data);
		
		if(slow==fast ) {
			
		
			slow = head;
			
			while(slow.next!=fast.next) {
				
				slow = slow.next;
				fast = fast.next;
	
			}
	
			fast.next =null; /// reset fast.next to nulll to remove link
			
		}
		
	}

}
