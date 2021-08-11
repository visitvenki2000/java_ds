package geeks.stack;

public class QueueImplList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedListQ listQ = new LinkedListQ();
		listQ.enque(2);		
		listQ.enque(3);
		listQ.enque(4);
		listQ.enque(5);
		
		
		System.out.println(listQ.deque());
		System.out.println(listQ.deque());
		System.out.println(listQ.deque());
		
		
		listQ.enque(6);
		listQ.enque(7);
		System.out.println(listQ.deque());
		System.out.println(listQ.deque());
		
		System.out.println(listQ.deque());
		
		System.out.println(listQ.deque());
		
	}

}

class LinkedListQ {
	
	public Node front;
	public Node rear;
	
	// handle if first 
	//
	public Integer enque(int data) {
		 Node temp = new Node(data);
		if(front==null) {
			front = temp;
			rear= temp;
			return 0;
		}
		
		rear.next = temp;
		rear =temp;
		
		
		return null;
	}
	public Integer deque() {
		
		if(front==null)
			return null;
		
		int result = front.data;
		front = front.next;
		
		return result;
	}
	
	public String toString() {
		String result ="";
		Node temp = front;
		//while(front)
		return result;
	}
	
}
class Node {
	Node(int item){
		data= item;	
	}
	public int data;
	public Node next;
	
}
